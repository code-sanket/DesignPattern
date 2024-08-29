package SOLID;

public class InterfaceSegregation {
    //definition -- Clients should not be forced to depend on interfaces they do not use.

    //wrong case

     interface Worker{
        void work();
        void eat();
    }

    static class HumanWorker implements Worker {

        @Override
        public void work() {
            // do work
        }

        @Override
        public void eat() {
            // eat
        }
    }

    static class RobotWorker implements Worker{

        @Override
        public void work() {
            // work
        }

        @Override
        public void eat() {
            // here it will throw exception
        }
    }

    // here we are forcing the client to use that method eat even if it is not needed.

    // correct way

    interface NewWorker{
         void work();
    }

    interface Eatable{
         void eat();
    }

    static class IntelligentHumanWorker implements Eatable , NewWorker{

        @Override
        public void eat() {
            // eat
        }

        @Override
        public void work() {
            // work
        }
    }

    static class IntelligentRobotWorker implements NewWorker{

        @Override
        public void work() {
            // working
        }
    }

    // here we are not forcing them to use the non usable methods
}
