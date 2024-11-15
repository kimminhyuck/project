package org.zerock.controller;

import org.zerock.domain.Board;
import org.zerock.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/board")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/list")
    public String list(Model model) {
        List<Board> boards = boardService.getList();
        model.addAttribute("boards", boards);
        return "board/list";
    }

    @GetMapping("/register")
    public String register() {
        return "board/register";
    }

    @PostMapping("/register")
    public String register(Board board) {
        boardService.register(board);
        return "redirect:/board/list";
    }

    @GetMapping("/read")
    public String read(@RequestParam("bno") Long bno, Model model) {
        Board board = boardService.get(bno);
        model.addAttribute("board", board);
        return "board/read";
    }

    @GetMapping("/modify")
    public String modify(@RequestParam("bno") Long bno, Model model) {
        Board board = boardService.get(bno);
        model.addAttribute("board", board);
        return "board/modify";
    }

    @PostMapping("/modify")
    public String modify(Board board) {
        boardService.modify(board);
        return "redirect:/board/list";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam("bno") Long bno) {
        boardService.remove(bno);
        return "redirect:/board/list";
    }
}
