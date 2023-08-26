import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPClass {
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(7788);
        while (true)
        {
            Socket socket = ss.accept();
            System.out.println("与客户端对接成功");
            OutputStream os = socket.getOutputStream();
            os.write(("服务器正在响应客户端").getBytes());
            os.close();
            socket.close();
        }
    }
}
class Client{

    public void test() throws Exception{
        Socket socket = new Socket(InetAddress.getLocalHost(),7788);
        InputStream in = socket.getInputStream();
        byte[] b = new byte[1024];
        int len = in.read(b);
        while (len != -1){
            System.out.println(new String(b,0,len));
            len = in.read(b);
        }
        in.close();
        socket.close();
    }
}
