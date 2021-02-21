package bg.softuni.exam.web;

import bg.softuni.exam.models.binding.AlbumBindingModel;
import bg.softuni.exam.models.service.AlbumServiceModel;
import bg.softuni.exam.services.AlbumService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@RequestMapping("/albums")
public class AlbumController {
    private final AlbumService albumService;
    private final ModelMapper modelMapper;

    public AlbumController(AlbumService albumService, ModelMapper modelMapper) {
        this.albumService = albumService;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/add")
    public String add(Model model, HttpSession httpSession){
        if(httpSession.getAttribute("user") == null){
            return "redirect:../users/login";
        }
        if(!model.containsAttribute("albumBindingModel")){
            model.addAttribute("albumBindingModel", new AlbumBindingModel());
            model.addAttribute("exists", false);
        }

        return "add-album";
    }

    @PostMapping("/add")
    public String addConfirm(@Valid AlbumBindingModel albumBindingModel,
                             BindingResult bindingResult,
                             RedirectAttributes redirectAttributes){
        if(bindingResult.hasErrors()){
            redirectAttributes.addFlashAttribute("albumBindingModel",albumBindingModel);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.albumBindingModel", bindingResult);
            return "redirect:add";
        }

        AlbumServiceModel albumServiceModel = modelMapper.map(albumBindingModel, AlbumServiceModel.class);
        boolean isSaved = albumService.addAlbum(albumServiceModel);

        if (!isSaved) {
            redirectAttributes.addFlashAttribute("albumBindingModel",albumBindingModel);
            redirectAttributes.addFlashAttribute("exists", true);
            return "redirect:add";
        }

        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") String id, HttpSession httpSession) {
        if (httpSession.getAttribute("user") == null){
            return "redirect:../users/login";
        }
        albumService.deleteById(id);
        return "redirect:/";
    }

}
