package assg2;

// PC Class representing the product we want to build
public class PC {
    private String processor;
    private String videoCard;
    private int memory;

    // Private constructor to ensure PC is only built via the builder
    private PC(PCBuilder builder) {
        this.processor = builder.processor;
        this.videoCard = builder.videoCard;
        this.memory = builder.memory;
    }

    @Override
    public String toString() {
        return "PC Configuration: Processor=" + processor +
                ", Video Card=" + videoCard +
                ", Memory=" + memory + "GB";
    }

    // Static nested Builder class
    public static class PCBuilder {
        private String processor;
        private String videoCard;
        private int memory;

        // Set processor
        public PCBuilder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        // Set video card
        public PCBuilder setVideoCard(String videoCard) {
            this.videoCard = videoCard;
            return this;
        }

        // Set memory
        public PCBuilder setMemory(int memory) {
            this.memory = memory;
            return this;
        }

        // Build the PC
        public PC build() {
            return new PC(this);
        }
    }

    // Main method to demonstrate the builder pattern
    public static void main(String[] args) {
        // Using the builder pattern to create a PC configuration
        PC gamingPC = new PC.PCBuilder()
                .setProcessor("Intel Core i9")
                .setVideoCard("NVIDIA RTX 3080")
                .setMemory(32)
                .build();

        System.out.println(gamingPC);
    }
}
