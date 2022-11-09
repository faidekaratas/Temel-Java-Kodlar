public class Main {
    public static void main(String[] args) {

        BaseCrediManager[] krediManagers = new BaseCrediManager[]{new OgrenciCrediManager(),
                new OgretmenCrediManager(), new TarimCrediManager()};
        for (BaseCrediManager krediManager : krediManagers) {
            System.out.println(krediManager.hesapla(1000));
        }
    }
}