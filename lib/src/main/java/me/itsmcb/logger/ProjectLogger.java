package me.itsmcb.logger;

public class ProjectLogger {

    private String projectName = "";
    private boolean includeProjectNameInOutput = false;
    private boolean debug = false;
    private String defaultColor = ansiColors.RESET.get();
    private String warnColor = ansiColors.YELLOW.get();
    private String errorColor = ansiColors.RED.get();
    private String debugColor = ansiColors.CYAN.get();

    /**
     * Creates a new logger instance
     * @param projectName Identifies the project when logged in the console.
     * @param outputProjectName Should the project name be appended to the logged content?
     * @param debug Should debug messages be logged?
     */
    public ProjectLogger(String projectName, boolean outputProjectName, boolean debug) {
        this.projectName = projectName;
        this.includeProjectNameInOutput = outputProjectName;
        this.debug = debug;
    }

    // Formatter

    private void formatAndPrint(String message, String color) {
        String output = color;
        if (includeProjectNameInOutput) {
            output = output + "[" + projectName + "] ";
        }
        System.out.println(output + message + ansiColors.RESET.get());
    }

    // Logging Methods

    public void log(String text) {
        formatAndPrint(text, defaultColor);
    }

    public void warn(String text) {
        formatAndPrint(text, warnColor);
    }

    public void error(String text) {
        formatAndPrint(text, errorColor);
    }

    public void debug(String text) {
        if (debug) { formatAndPrint(text, debugColor); }
    }

    // Customization Methods

    public void setDefaultColor(String ansiColorString) {
        this.defaultColor = ansiColorString;
    }

    public void setWarnColor(String ansiColorString) {
        this.warnColor = ansiColorString;
    }

    public void setErrorColor(String ansiColorString) {
        this.errorColor = ansiColorString;
    }

    public void setDebugColor(String ansiColorString) {
        this.debugColor = ansiColorString;
    }

    // Debug

    /**
     * Sets the debug mode which allows or disallows debug calls to be outputted.
     * @param bool
     */
    public void setDebug(boolean bool) {
        this.debug = bool;
    }

    public boolean getDebug() {
        return this.debug;
    }
}