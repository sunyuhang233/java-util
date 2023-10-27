package top.hang;/**
 * Created with IntelliJ IDEA.
 *
 * @Author: AHang
 * @Date: 2023/10/27/8:28
 * @Description:
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author : Ahang
 * @program : demo
 * @description :
 * @create : 2023-10-27 08:28
 **/

public class TimeUtil {
    public static String timeUtil(LocalDateTime localDateTime) {
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return timeFormatter.format(localDateTime);
    }

    public static void main(String[] args) {
        System.out.println(TimeUtil.timeUtil(LocalDateTime.now()));
    }
}
