package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zi0 {
    public static String a(qv qvVar) {
        String string = qvVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }
}
