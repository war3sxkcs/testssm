package com.smallkk.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * Created by   song 醉美柳舞之众星捧月
 * Date & Time  2017/10/14 19:14
 */
//    @Controller 归 Springmvc 处理;   @Controller全是请求处理
//    @RequestMapping("")   请求路径
@Controller
@RequestMapping("user")
public class UserController {
    //  每一个请求都对应一个方法 ！！     // 返回的都是一个路径/字符串/就是jsp页面的名称
    // @RequestMapping("/test")
//    public String testUser(ModelMap modelMap, User user) {
////        String id = request.getParameter("id");
////        String name = request.getParameter("name");
////        User user = new User();
////        user.setId(28);
////        user.setName("laowang");
//        modelMap.addAttribute("user", user);
//        return "user";     // 返回页面的名称：就是jsp的名称


    //     @ResponseBody 表示用的配置里面的fastjson
    @RequestMapping("/test")
    @ResponseBody
    public String testUser(@RequestBody User user) {
//        User user = new User();
//        user.setId(999);
//        user.setName("laowang");
        System.out.println(user.getId());
        System.out.println(user.getName());
        return "user";
    }


    // 请求 转发和 重定向
    //  forward      redirect
    //   return "redirect:/user/demo";   返回到另外一个地方
//        springMVC怎么获取或者接收前台传过来的值
//    eg:     @RequestMapping("/test/{id}{name}")  // 表示从前台获取过来的id和name             //    这种方式是    doGet
//      public String testUser(ModelMap modelMap,@PathVariable Integer id,@PathVariable String name)
//            PathVariable表示将id 和 name 的值当作参数传进去
//}

    @RequestMapping("/demo")
    public String testDemo() {
        return "demo";     // 返回页面的名称：就是jsp的名称
    }


//    @RequestMapping("/view")
//    public ModelAndView test() {
//        ModelAndView model = new ModelAndView();
//        model.setViewName("user");
//        User user = new User();
//        user.setId(28);
//        user.setName("laowang");
//        model.addObject("user", user);    //给前台传点值
//        return model;
//    }


    //   SpringMVC上传文件
    @RequestMapping("/upload")
    public String upLoad(MultipartFile file, HttpServletRequest request) throws IOException {
        String name = file.getOriginalFilename();   //这个文件的名称
        File upLoadF = new File("/" + name);   // 项目的根目录下
        file.transferTo(upLoadF);
        return "demo";
    }

    //    文件下载
    @RequestMapping("/down")
    public ResponseEntity<byte[]> download() throws IOException {
        String path = "D:\\1.jpg";     //  文件所在地和文件的名字格式
        File file = new File(path);
        HttpHeaders headers = new HttpHeaders();      //告诉Http头
        headers.setContentDispositionFormData("attachment", path);   //我这儿有一个附件  ;path是路径
        headers.setContentType(MediaType.IMAGE_JPEG);     // 这个附件是什么类型的
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers, HttpStatus.CREATED);
    }
}
