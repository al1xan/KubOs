public class Main {
    public static void main(String[] args) {
        String yamlFile = "src/pod.yaml";
        SecurityContext.mSecurityContext(yamlFile);
        RunAsNonRoot.mRunAsNonRoot(yamlFile);
        Privileged.mPrivileged(yamlFile);
        PrivilegeEscalation.mPrivilegeEscalation(yamlFile);
        AutomountServiceAccountToken.mAutomountServiceAccountToken(yamlFile);
        StartupProbe.mStatupPrube(yamlFile);
        SeLinux.mSeLinux(yamlFile);
        ReadOnlyFileSystem.mReadOnlyFileSystem(yamlFile);
        ProcessExecution.mProcessExecution(yamlFile);
        Secrets.mSecrets();
        AnonymousAuth.mAnonymousAuth(yamlFile);
        Tls.mTls(yamlFile);
        ProcessKprobe.mProcessKprobe(yamlFile);


    }
}

