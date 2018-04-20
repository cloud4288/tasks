export class Task {
    name: string;
    completed: boolean;
    dueDate: string;

    constructor(name: string, completed: boolean, dueDate: string) {
        this.name = name;
        this.completed = completed;
        this.dueDate = dueDate;
    }
}

