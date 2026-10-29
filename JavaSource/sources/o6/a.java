package o6;

import q6.i;
import u6.b;

/* compiled from: MyApplication */
public abstract class a {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class a(b bVar) {
        i.e(bVar, "<this>");
        Class b8 = ((q6.b) bVar).b();
        if (!b8.isPrimitive()) {
            i.c(b8, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return b8;
        }
        String name = b8.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    b8 = Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    b8 = Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    b8 = Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    b8 = Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    b8 = Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    b8 = Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    b8 = Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    b8 = Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    b8 = Short.class;
                    break;
                }
                break;
        }
        i.c(b8, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return b8;
    }
}
