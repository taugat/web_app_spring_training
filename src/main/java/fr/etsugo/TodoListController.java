package fr.etsugo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoListController
{

    public final TodoRepository todoRepository;

    public TodoListController(TodoRepository todoRepository)
    {
        this.todoRepository = todoRepository;
    }

    @GetMapping("/api/todo")
    public Iterable<TodoEntity> getArrayList()
    {
        return todoRepository.findAll();
    }
    @PostMapping("/api/todo")
    public void addToArrayList(@RequestBody TodoEntity e)
    {
        todoRepository.save(e);
    }
}
