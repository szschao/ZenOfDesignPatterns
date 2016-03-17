class Client {
    public static void main(String args[]) {
        IRunner liu = new Runner();
        //对其功能加强
        liu = new RunnerWithJet(liu);
        //看看他的跑步情况如何
        System.out.println("===增强后的运动员的功能===");
        liu.run();
    }
}

