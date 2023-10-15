package br.com.warleybonanno.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * LOMBOK - Dependencia que auxilia nos getters e setters
 * Pesquisar mais a respeito depois
 * @Data - Getters e Setters
 * @Getter - Apenas os Getters
 * @Setters - Apenas os Setters
 */

@Data
@Entity(name = "tb_users")
public class UserModel {

    // Se não colocar nenhum modificador ele irá considerar como public

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(unique = true)
    private String username;
    private String name;
    private String password;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
