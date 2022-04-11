package akademia.devopsi.pl.akademiadevopsitest;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ToDoService {

    private final Map<Integer,Task> tasks;
    private final TaskMapper taskMapper;

    public ToDoService(TaskMapper taskMapper){
        this.tasks= new HashMap<>();
        this.taskMapper=taskMapper;
    }

    public void addTask(TaskCreateDto dto) {
        Task task = taskMapper.map(dto);
        task.setId(this.tasks.size()+1);
        this.tasks.put(task.getId(),task);
    }

    public void updateTask(int id, Task task) {
        if(this.tasks.containsKey(id)){
            this.tasks.put(id,task);
        }
    }

    public void deleteTask(int id) {
            this.tasks.remove(id);
    }

    public List<Task> getTasks() {
        List<Task>tmpTasks=new ArrayList<>();
        for(int id:this.tasks.keySet()){
            tmpTasks.add(this.tasks.get(id));
        }
        return tmpTasks;
    }
}
