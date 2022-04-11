package akademia.devopsi.pl.akademiadevopsitest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
@RequiredArgsConstructor
public class ToDoController {

    private final ToDoService toDoService;


    @PostMapping("/tasks")
    public ResponseEntity<Void>addTask(@RequestBody TaskCreateDto task){
        this.toDoService.addTask(task);
        return ResponseEntity.status(HttpStatus.CREATED)
                .build();
    }
    @PutMapping("/tasks/{id}")
    public ResponseEntity<Task>updateTask(@PathVariable int id, @RequestBody Task task){
        this.toDoService.updateTask(id, task);
        return ResponseEntity.status(HttpStatus.OK)
                .body(task);
    }

    @DeleteMapping("/tasks/{id}")
    public ResponseEntity<Void>deleteTask(@PathVariable int id){
        this.toDoService.deleteTask(id);
        return ResponseEntity.status(HttpStatus.OK)
                .build();
    }

    @GetMapping("/tasks")
    public ResponseEntity<List<Task>>getTasks(){
        List<Task>tasks=this.toDoService.getTasks();
        return ResponseEntity.status(HttpStatus.OK)
                .body(tasks);
    }

}
