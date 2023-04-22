public class AppSingelton {
    private static AppSingelton App;
    private AppSingelton(){



    }
    private static AppSingelton getInstance(){
        if(null == App){
            App = new AppSingelton();
        }
        return App;
    }
}
