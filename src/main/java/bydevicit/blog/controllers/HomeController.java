package bydevicit.blog.controllers;

import bydevicit.blog.entity.concrete.Category;
import bydevicit.blog.entity.concrete.Post;
import bydevicit.blog.entity.concrete.User;
import bydevicit.blog.libs.KTTheme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("home")
public class HomeController {

    @Autowired
    private KTTheme theme;

    @GetMapping()
    public String home(Model model) {
        User user = new User(1, "alperylmztrk", "123", "alper", "yılmaztürk", "alperylr@gmail.com", LocalDate.of(1998, 5, 23), null, null);
        Post post = new Post(1, user, "başlık", "içerik", null, 0L, null, null, null);
        Post post2 = new Post(2, user, "başlık2", "içerik2", null, 0L, null, null, null);

        List<Post> postList = List.of(post, post2);

        Category category = new Category(1, "Programlama Dilleri", null);
        Category category1 = new Category(2, "DevOps", null);
        Category category2 = new Category(3, "Veri Tabanı", null);
        Category category3 = new Category(4, "Mobil", null);

        List<Category> categoryList = List.of(category, category1, category2, category3);

        model.addAttribute("categories", categoryList);

        model.addAttribute("home", postList);


        return theme.getPageView("home", "sidebar");
    }
}
