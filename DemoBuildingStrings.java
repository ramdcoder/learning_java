class DemoBuildingStrings
{
    public static void main(String[] args)
    {
        System.out.println("Building a string from many small pieces: ");

        StringBuilder builder = new StringBuilder();

        String aGreet = "Bom dia!";
        String aString = "Mas muito bom dia mesmo!";

        builder.append(aGreet);
        builder.append(aString);
        String completeString = builder.toString();
        System.out.println(completeString);
    }
}
