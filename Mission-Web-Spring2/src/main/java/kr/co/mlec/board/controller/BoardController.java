package kr.co.mlec.board.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.co.mlec.board.service.BoardService;
import kr.co.mlec.board.vo.BoardVO;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping("/board/list.do")
	public ModelAndView selectAll() {		
		List<BoardVO> boardList = boardService.selectAllBoard();
		
		ModelAndView mav = new ModelAndView("board/list");
		mav.addObject("boardList", boardList);
		
		return mav;
	}

	// board/3/detail.do
	@RequestMapping("/board/{no}/detail.do")
	public String selectDetail(@PathVariable("no") int no, Model model) {
		BoardVO board = boardService.selectByNo(no);
		
		model.addAttribute("board", board);
		
		return "board/detail";
	}
/*	
	public void selectByNo(@RequestParam("no") int no) {
		System.out.println("no : " + no);
	}
*/	
	@RequestMapping(value="/board/write.do", method=RequestMethod.GET)
	public String writeForm(Model model) {
		
		model.addAttribute("boardVO", new BoardVO());
		return "board/write";
	}
	
	@RequestMapping(value="/board/write.do", method=RequestMethod.POST)
	public String write(@Valid BoardVO boardVO, BindingResult result) {
		if(result.hasErrors()) {
			System.out.println("오류발생이라오");
			return "board/write";
		}
		boardService.insert(boardVO);
		
		return "redirect:/board/list.do";
	}
}
