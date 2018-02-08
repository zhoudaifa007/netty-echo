package client;

/**
 *
 */
public class EchoTest {

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 20; i++) {
            EchoClient echoClient = new EchoClient("10.10.10.10", 2007);
            echoClient.init();
            System.out.println("初始化完成");
//            Thread task = new Thread(echoClient);
//            task.start();
        }
    }
}
