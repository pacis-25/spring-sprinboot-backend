package net.javaguides.todo.repository;

import net.javaguides.todo.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

// second create a repository interface for todo entity

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
