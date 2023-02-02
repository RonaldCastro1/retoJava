package com.example.retoJava.Repository;


import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.retoJava.Model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Page<Usuario> findAll(Pageable pageable);

   /*  Page<Usuario> findAll(Pageable pageable);
     */
}
