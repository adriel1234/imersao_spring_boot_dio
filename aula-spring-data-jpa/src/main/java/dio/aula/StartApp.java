package dio.aula;

import dio.aula.model.User;
import dio.aula.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartApp  implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        //List<User> users = repository.filtrarPorNome("maria");
        List<User> users = repository.findByNameContaining("maria");

        for (User u:users) {
            System.out.println(u);
        }

    }

    public  void inserUser(){
        User user = new User();
        user.setName("maria");
        user.setUsername("ma2422");
        user.setPassword("12312");

        repository.save(user);

        for(User u: repository.findAll()){
            System.out.println(u);
        }

    }
}
