 class VotingNestedIf {
    public static void main(String[] args) {

        int age = 22;
        String country = "India";

        if (country.equals("India")) {
            if (age >= 18) {
                System.out.println("You can vote in India");
            } else {
                System.out.println("Age is less than 18");
            }
        } else {
            System.out.println("You are not an Indian citizen");
        }
    }
}
