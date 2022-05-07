package br.com.maddytec.app.service;

import br.com.maddytec.app.entity.User;
import br.com.maddytec.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User save(User usuario){
        return userRepository.save(usuario);
    }

    public List<User> clientList(){
        return userRepository.findAll();
    }

    public Optional<User> findById(Long id){
        return userRepository.findById(id);
    }

    public void removerPorId(Long id){
        userRepository.deleteById(id);
    }
}
