package life.rabbit.community.controller.provider;

import com.alibaba.fastjson.JSON;
import life.rabbit.community.controller.dto.AccessTokenDTO;
import life.rabbit.community.controller.dto.GithubUser;
import okhttp3.*;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class GithubProvider {
    public String getAccessToken(AccessTokenDTO accessTokenDTO) {
        MediaType mediaType = MediaType.get("application/json; charset=utf-8");
        OkHttpClient client = new OkHttpClient();
        RequestBody body = RequestBody.create(mediaType, JSON.toJSONString(accessTokenDTO));
        Request request = new Request.Builder()
                .url("https://oauth.aliyun.com/v1/token?client_id=4224772885281630216&client_secret=c06141ef-923c-4e71-9a48-8b8fb20de54f&code="+accessTokenDTO.getCode()+"&redirect_uri=http://localhost:8887/callback&state=1")
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            String string = response.body().string();
            String token = string.split("&")[0].split("=")[1];
            return token;
        } catch (Exception e) {
                e.printStackTrace();
        }
        return null;
    }


    public GithubUser getUser(String accessToken) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://oauth.aliyun.com/v1/token" + accessToken)
                .build();
        try{
            Response response = client.newCall(request).execute();
            String string = response.body().string();
            GithubUser githubUser = JSON.parseObject(string, GithubUser.class);
            return githubUser;
        }catch(IOException e){
        }
        return null;


}
}

