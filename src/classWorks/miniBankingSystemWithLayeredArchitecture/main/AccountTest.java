package classWorks.miniBankingSystemWithLayeredArchitecture.main;

import classWorks.miniBankingSystemWithLayeredArchitecture.controller.AccountController;
import classWorks.miniBankingSystemWithLayeredArchitecture.repository.AccountRepository;
import classWorks.miniBankingSystemWithLayeredArchitecture.services.AccountService;

public class AccountTest {
    public static void main(String[] args) {
        AccountRepository repository=new AccountRepository();
        AccountService service=new AccountService(repository);
        AccountController controller=new AccountController(service);
        System.out.println("""
                ===========================
                   MJ MICROFINANCE BANK
                ===========================
                Welcome to MJ banking services!
                A series of options will be displayed
                below for you to choose from.""");
        controller.performActions();

    }
}
