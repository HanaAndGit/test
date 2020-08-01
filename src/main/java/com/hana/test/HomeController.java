package com.hana.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hana.test.domain.Board;
import com.hana.test.domain.User;
import com.hana.test.service.BoardService;
import com.hana.test.service.UserService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	UserService userService;
	
	@Autowired
	BoardService boardService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(HttpSession session,String userid, String userpw, Model model) throws Exception {
	
		User user = userService.getUserById(userid);
		String pw = user.getUserpw();
		
		if(pw.equals(userpw)) {
			model.addAttribute("success","success");
			session.setAttribute("Auth", user);
			return "home";
		}else {
			model.addAttribute("fail","fail");
			return "home";
		}
		
	}
	
	@RequestMapping(value="join", method= RequestMethod.GET)
	public String join( Model model) throws Exception{
		
		int userCnt = userService.getUserCnt();
		model.addAttribute("userCnt", userCnt+1);
		
		return "join";
	}
	
	@RequestMapping(value="join", method= RequestMethod.POST)
	public String joinPost(User user, Model model) throws Exception {
		
		userService.addUser(user);
		model.addAttribute("joinSuccess");
		return "home";
	}
	
	@RequestMapping(value="gotoboard", method=RequestMethod.GET)
	public String gotoboard(Model model) throws Exception{
		
		List<Board> list = boardService.getBoardList();
		model.addAttribute("list", list);
		
		return "board";
	}
	
	@RequestMapping(value="register", method =RequestMethod.GET)
	public String register(HttpSession session ,Model model) throws Exception{
		
		Date date = new Date();
		model.addAttribute("now", date);
		
		int boardCnt = boardService.getBoardCnt();
		model.addAttribute("boardCnt", boardCnt+1);
		
		User loginUser = (User) session.getAttribute("Auth");
		model.addAttribute("loginUser", loginUser.getUserid());
		
		return "register";
	}
	
	@RequestMapping(value="register", method = RequestMethod.POST)
	public String registerPost(Board board) throws Exception{
		
		Calendar cal = Calendar.getInstance();


		//2. Date 객체 생성(현재 시간)
		Date now = new Date();


		//3. 형식 변경 해주는 SimpleDateFormat 생성 후 패턴 정해줌 
		SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd");


		//4. Date 객체를 SimpleDateFormat에 넣어서 형식 변경
		String to = transFormat.format(now);


		//5. 하나하나 잘라줌 (year : 2020, month : 05, date : 19 ) 
		String year = to.substring(0, to.indexOf("-"));
		String month = to.substring(to.indexOf("-")+1, to.lastIndexOf("-"));
		String date = to.substring(to.lastIndexOf("-")+1);


		//6. 캘린더 객체에 날짜를 세팅 
		cal.set(Integer.parseInt(year), Integer.parseInt(month)-1,Integer.parseInt(date)-1);
				

		//8. 캘린더에서 시간을 가져와서 SimpleFormatDate로 형식 변경 후 String 변수에 넣음 
		String edate = transFormat.format(cal.getTime());


		//9. 객체 생성
	


		//10. 객체에 변경 된 date 세팅 
		board.setBoarddate(edate);
		
		
		boardService.addBoard(board);
		
		        
		return "redirect:/gotoboard";
	}
	
	@RequestMapping(value="detail", method =RequestMethod.GET)
	public String detail(String no, Model model) throws Exception{
		
		Board board = boardService.getBoardByNo(Integer.parseInt(no));
		model.addAttribute("board", board);
		
		return "detail";
	}
	
}
