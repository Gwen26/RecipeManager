package fr.imie.MyRecipeProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.imie.MyRecipeProject.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
