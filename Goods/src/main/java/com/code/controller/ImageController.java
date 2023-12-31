package com.code.controller;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;
import javax.servlet.http.HttpServletRequest;

import com.code.pojo.GoodsPic;
import com.code.service.GoodsPicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin //允许所有ip跨域
public class ImageController {


    @RequestMapping("/Goods/image/set")
    public String oneFileUpload(
            @RequestParam("file") MultipartFile file,
            HttpServletRequest request) throws IOException {

        // 获得原始文件名
        String fileName = file.getOriginalFilename();
        System.out.println("原始文件名:" + fileName);
        // 新文件名
        String newFileName = UUID.randomUUID().toString().trim().replaceAll("-", "")+fileName;



        // 获得项目的路径
        //ServletContext sc = request.getSession().getServletContext();
        // 上传位置
        // String path = sc.getRealPath("/img") + "/"; // 设定文件保存的目录
//        String path1 = ClassUtils.getDefaultClassLoader().getResource("image").getPath();
        String contextPath = request.getContextPath();
        String realPath = request.getSession().
                getServletContext().getRealPath("/");
        String basePath = request.getScheme()+"://"+request.getServerName()+":"+
                request.getServerPort()+contextPath+"/";



        String path="";
        if (System.getProperty("os.name").toLowerCase().contains("linux")){
//		        windows文件路径
            path=realPath+"Goods\\static\\images\\";
        }else if (System.getProperty("os.name").toLowerCase().contains("windows")){
//		        linux文件路径
            path=realPath+"Goods/static/images/";
        }else{
            System.out.println("judge system occur error");
        }


        System.out.println("path:" + path);
//        System.out.println("path1:" + path1);
//        System.out.println("contextPath:" + contextPath);
        System.out.println("realPath:" + realPath);
//        System.out.println("basePath:" + basePath);

        File f = new File(path);
        System.out.println("f:---" + f.getPath());
        if (!f.exists())
            f.mkdirs();
        if (!file.isEmpty()) {
            try {
                FileOutputStream fos = new FileOutputStream(path +""+ newFileName);
                InputStream in = file.getInputStream();
                int b = 0;
                while ((b = in.read()) != -1) {
                    fos.write(b);
                }
                fos.close();
                in.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("f:---+++++" + f.getPath());
        System.out.println("上传图片到:" + path +""+ newFileName);

        String src = basePath +"Goods/static/images/"+ newFileName;
        src="http://43.139.187.120:8080/Goods/static/images/"+newFileName;

//        GoodsPic goodsPic = new GoodsPic();
//        goodsPic.setGoodsId(Integer.valueOf(courseId));
//        goodsPic.setUrl(src);
//        goodsPicService.save(goodsPic);
        return src;
    }

}
