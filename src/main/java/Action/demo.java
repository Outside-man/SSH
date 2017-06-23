package Action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Yxm on 2017/6/23.
 */
public class demo extends ActionSupport {
    public String index(){
        System.out.println("hello world");
        return "index";
    }
}
