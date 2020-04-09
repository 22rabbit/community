package life.rabbit.community.controller;

import life.rabbit.community.controller.dto.AccessTokenDTO;
import life.rabbit.community.controller.dto.GithubUser;
import life.rabbit.community.controller.provider.GithubProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

@Controller
public class AuthorizeController {
    @Autowired
    private GithubProvider githubProvider;




//   @Value("${github.client.id}")
//    private String clientId;
//
//    @Value("${github.client.secret}")
//    private String clientSecret;
//
//    @Value("${github.redirect.uri}")
//    private String RedirectUri;

    @GetMapping("/callback")
    public String callback(@RequestParam(name = "code") String code,
                           @RequestParam(name="state") String state) {
        AccessTokenDTO accessTokenDTO = new AccessTokenDTO();
        accessTokenDTO.setCode(code);
        accessTokenDTO.setState(state);
        accessTokenDTO.setClient_id("4224772885281630216");
        accessTokenDTO.setClient_secret("c06141ef-923c-4e71-9a48-8b8fb20de54f");
        accessTokenDTO.setRedirect_uri("http://localhost:8887/callback");
        String accessToken = githubProvider.getAccessToken(accessTokenDTO);
        GithubUser user;
        user = githubProvider.getUser(accessToken);
        System.out.println(user.getName());
        return "index";
    }
}
