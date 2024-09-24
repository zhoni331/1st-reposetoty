public class logger {
    private String loglevel;
    private String format;
    private boolean tofile;
    private String pathtofile;
    private logger(Builder builder){
        this.loglevel=builder . loglevel;
        this.format = builder . format;
        this.tofile = builder . tofile;
        this.pathtofile = builder . pathtofile;
    }
    public void log(String message){
        System.out.println("[" + loglevel + "]\n" + "[" + format + "]\n" +
                '[' + tofile + "]\n" + '[' + pathtofile + "]\n" +  message);
    }
    public static class Builder{
        private String loglevel = "INFO";
        private String format = "Text plan";
        private boolean tofile = false;
        private String pathtofile;

        public Builder setlogLevel(String loglevel){
            this.loglevel = loglevel;
            return this;
        }
        public Builder setformat(String format){
            this.format = format;
            return this;
        }
        public Builder logtofile(String pathtofile){
            this.tofile = true;
            this.pathtofile = pathtofile;
            return this;
        }

        public logger build(){
            return new logger(this);
        }
    }
    public static void main(String[] args ){
        logger logger1 = new logger.Builder()
                .setlogLevel("DEBUG")
                .setformat("INDEX")
                .logtofile("/apps/app.log")
                .build();



        logger1.log("This is a log message!");
    }
}
