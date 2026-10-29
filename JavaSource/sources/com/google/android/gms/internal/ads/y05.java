package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: MyApplication */
abstract class y05 {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f19330a;

    static {
        char[] cArr = new char[80];
        f19330a = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String a(v05 v05Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        c(v05Var, sb, 0);
        return sb.toString();
    }

    static void b(StringBuilder sb, int i7, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i7, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i7, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        d(i7, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i8 = 1; i8 < str.length(); i8++) {
                char charAt = str.charAt(i8);
                if (Character.isUpperCase(charAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(w15.a(qy4.t((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof qy4) {
            sb.append(": \"");
            sb.append(w15.a((qy4) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof sz4) {
            sb.append(" {");
            c((sz4) obj, sb, i7 + 2);
            sb.append("\n");
            d(i7, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i9 = i7 + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        b(sb, i9, "key", entry.getKey());
        b(sb, i9, "value", entry.getValue());
        sb.append("\n");
        d(i7, sb);
        sb.append("}");
    }

    private static void c(v05 v05Var, StringBuilder sb, int i7) {
        int i8;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = v05Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i9 = 0;
        while (true) {
            i8 = 3;
            if (i9 >= length) {
                break;
            }
            Method method3 = declaredMethods[i9];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i9++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i8);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                b(sb, i7, substring.substring(0, substring.length() - 4), sz4.t(method2, v05Var, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                b(sb, i7, substring.substring(0, substring.length() - 3), sz4.t(method, v05Var, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object t7 = sz4.t(method4, v05Var, new Object[0]);
                    if (method5 != null) {
                        if (!((Boolean) sz4.t(method5, v05Var, new Object[0])).booleanValue()) {
                        }
                        b(sb, i7, substring, t7);
                    } else if (t7 instanceof Boolean) {
                        if (!((Boolean) t7).booleanValue()) {
                        }
                        b(sb, i7, substring, t7);
                    } else if (t7 instanceof Integer) {
                        if (((Integer) t7).intValue() == 0) {
                        }
                        b(sb, i7, substring, t7);
                    } else if (t7 instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) t7).floatValue()) == 0) {
                        }
                        b(sb, i7, substring, t7);
                    } else if (t7 instanceof Double) {
                        if (Double.doubleToRawLongBits(((Double) t7).doubleValue()) == 0) {
                        }
                        b(sb, i7, substring, t7);
                    } else {
                        if (t7 instanceof String) {
                            equals = t7.equals("");
                        } else if (t7 instanceof qy4) {
                            equals = t7.equals(qy4.f14669r);
                        } else if (t7 instanceof v05) {
                            if (t7 == ((v05) t7).b()) {
                            }
                            b(sb, i7, substring, t7);
                        } else {
                            if ((t7 instanceof Enum) && ((Enum) t7).ordinal() == 0) {
                            }
                            b(sb, i7, substring, t7);
                        }
                        if (equals) {
                        }
                        b(sb, i7, substring, t7);
                    }
                }
            }
            i8 = 3;
        }
        z15 z15Var = ((sz4) v05Var).zzt;
        if (z15Var != null) {
            z15Var.i(sb, i7);
        }
    }

    private static void d(int i7, StringBuilder sb) {
        while (i7 > 0) {
            int i8 = 80;
            if (i7 <= 80) {
                i8 = i7;
            }
            sb.append(f19330a, 0, i8);
            i7 -= i8;
        }
    }
}
