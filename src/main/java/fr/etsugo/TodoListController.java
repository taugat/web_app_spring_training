package fr.etsugo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoListController
{

    public final List<Todo> arrayList = new ArrayList<>();

    @GetMapping("/api/todo")
    public List<Todo> getArrayList()
    {
        return arrayList;
    }
    @PostMapping("/api/todo")
    public void addToArrayList(@RequestBody Todo e)
    {
        arrayList.add(e);
    }
}
