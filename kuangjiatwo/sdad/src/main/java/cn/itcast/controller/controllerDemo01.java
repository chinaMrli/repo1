package cn.itcast.controller;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/demo01")
public class controllerDemo01 {
    //文件上传

    @RequestMapping("test1")
    public String test1(HttpServletRequest request) throws Exception {
        System.out.println("文件上传");
        //上传的位置
        String path = request.getSession().getServletContext().getRealPath( "/uploads/" );
        //判断路径是否存在
        File file = new File( path );
        //不存在
        if (!file.exists()){
            file.mkdirs();
        }
        //解析request对象，获取上传文件项
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload( factory );
        List<FileItem> items = upload.parseRequest( request );
        //遍历
        for (FileItem item : items) {
            //进行判断，当前item对象是否是上传文件
            if (item.isFormField()){
            }else {
                //说明是上传文件  获取文件名称
                String itemName = item.getName();
                //把文件名设置成唯一值
                String uuid = UUID.randomUUID().toString().replace( "-", "" );
                itemName =uuid+"_"+itemName;
                //完成文件上传
                item.write( new File( path,itemName ) );
                //删除临时文件
                item.delete();
            }
        }
        return "success";
    }

}
