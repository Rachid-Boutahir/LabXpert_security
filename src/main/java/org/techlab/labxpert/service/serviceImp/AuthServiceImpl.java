package org.techlab.labxpert.service.serviceImp;

import org.springframework.stereotype.Service;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;

import org.techlab.labxpert.dtos.LoginDto;
import org.techlab.labxpert.dtos.RegisterDto;
import org.techlab.labxpert.service.I_AuthService;
import org.techlab.labxpert.repository.UtilisateurRepository;

@Service
public class AuthServiceImpl implements I_AuthService {

    private AuthenticationManager authenticationManager;
    private UtilisateurRepository utilisateurRepository;
    private PasswordEncoder passwordEncoder;




    @Override
    public String login(LoginDto loginDto) {
        return null;
    }

    @Override
    public String register(RegisterDto registerDto) {
        return null;
    }
}
