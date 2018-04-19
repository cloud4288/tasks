import { Component, OnInit } from '@angular/core';
import { Task } from '../tasks.model';

@Component({
    selector: 'app-tasks-list',
    templateUrl: './tasks-list.component.html',
    styleUrls: ['./tasks-list.component.css']
})
export class TasksListComponent implements OnInit {

    tasks: Task[] = [];

    constructor() {
    }

    ngOnInit() {
        this.tasks.push({id: 1, name: "Task 1", completed: true, dueDate: "04/19/17"});
        this.tasks.push({id: 2, name: "Task 2", completed: false, dueDate: "04/19/17"});
        this.tasks.push({id: 3, name: "Task 3", completed: false, dueDate: "04/19/17"});
    }

    getDueDateLabel(task: Task) {
        return task.completed ? 'label-success' : 'label-primary';
    }

    onTaskChange(event, task: Task) {
        console.log('Task has changed');
        // this.taskService.saveTask(task, event.target.checked).subscribe();
    }
}
