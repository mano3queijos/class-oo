package br.ucsal.advancedjava.Solid.SOLID;

import java.util.List;

public class Solid {

    interface Worker {
        void work();
    }

    interface Eater {
        void eat();
    }

    class Employee implements Worker, Eater {
        @Override
        public void work() {
            // Implementação do trabalho do funcionário
        }

        @Override
        public void eat() {
            // Implementação de como o funcionário come
        }
    }

    class Robot implements Worker {
        @Override
        public void work() {
            // Implementação do trabalho do robô
        }
    }

    class TaskManager {
        List<Worker> workers;

        TaskManager(List<Worker> workers) {
            this.workers = workers;
        }

        void assignTasks() {
            for (Worker worker : workers) {
                worker.work();
            }
        }
    }
}
