export class Task {
    id: number;
    name: string;
    completed: boolean;
    dueDate: string;

    constructor(id: number, name: string, completed: boolean, dueDate: string) {
        this.id = id;
        this.name = name;
        this.completed = completed;
        this.dueDate = dueDate;
    }
}

