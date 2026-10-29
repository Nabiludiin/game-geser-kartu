package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;

/* compiled from: MyApplication */
public abstract class jd3 {
    public static boolean a(mq mqVar) {
        int ordinal = mqVar.ordinal();
        return ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 5;
    }

    public static final mq b(Context context, lc3 lc3Var) {
        mq mqVar;
        FileInputStream fileInputStream;
        byte[] bArr;
        File file = new File(new File(context.getApplicationInfo().dataDir), "lib");
        if (file.exists()) {
            File[] listFiles = file.listFiles(new z34(Pattern.compile(".*\\.so$", 2)));
            if (listFiles == null || listFiles.length == 0) {
                if (lc3Var != null) {
                    lc3Var.e(5017, "No .so");
                } else {
                    lc3Var = null;
                }
                mqVar = mq.UNKNOWN;
            } else {
                try {
                    fileInputStream = new FileInputStream(listFiles[0]);
                    try {
                        bArr = new byte[20];
                    } finally {
                    }
                } catch (IOException e8) {
                    c(null, e8.toString(), context, lc3Var);
                }
                if (fileInputStream.read(bArr) == 20) {
                    byte[] bArr2 = {0, 0};
                    if (bArr[5] == 2) {
                        c(bArr, null, context, lc3Var);
                        mqVar = mq.UNSUPPORTED;
                    } else {
                        bArr2[0] = bArr[19];
                        bArr2[1] = bArr[18];
                        short s7 = ByteBuffer.wrap(bArr2).getShort();
                        if (s7 == 3) {
                            mqVar = mq.X86;
                        } else if (s7 == 40) {
                            mqVar = mq.ARM7;
                        } else if (s7 == 62) {
                            mqVar = mq.X86_64;
                        } else if (s7 == 183) {
                            mqVar = mq.ARM64;
                        } else if (s7 != 243) {
                            c(bArr, null, context, lc3Var);
                            mqVar = mq.UNSUPPORTED;
                        } else {
                            mqVar = mq.RISCV64;
                        }
                    }
                    fileInputStream.close();
                } else {
                    fileInputStream.close();
                    mqVar = mq.UNSUPPORTED;
                }
            }
        } else {
            if (lc3Var != null) {
                lc3Var.e(5017, "No lib/");
            } else {
                lc3Var = null;
            }
            mqVar = mq.UNKNOWN;
        }
        if (mqVar == mq.UNKNOWN) {
            String d8 = d(context, lc3Var);
            if (TextUtils.isEmpty(d8)) {
                c(null, "Empty dev arch", context, lc3Var);
                mqVar = mq.UNSUPPORTED;
            } else if (d8.equalsIgnoreCase("i686") || d8.equalsIgnoreCase("x86")) {
                mqVar = mq.X86;
            } else if (d8.equalsIgnoreCase("x86_64")) {
                mqVar = mq.X86_64;
            } else if (d8.equalsIgnoreCase("arm64-v8a")) {
                mqVar = mq.ARM64;
            } else if (d8.equalsIgnoreCase("armeabi-v7a") || d8.equalsIgnoreCase("armv71")) {
                mqVar = mq.ARM7;
            } else if (d8.equalsIgnoreCase("riscv64")) {
                mqVar = mq.RISCV64;
            } else {
                c(null, d8, context, lc3Var);
                mqVar = mq.UNSUPPORTED;
            }
        }
        if (lc3Var != null) {
            lc3Var.e(5018, mqVar.name());
        }
        return mqVar;
    }

    private static final void c(byte[] bArr, String str, Context context, lc3 lc3Var) {
        if (lc3Var == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("os.arch:");
        sb.append(hy3.OS_ARCH.c());
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            sb.append("dbg:");
            sb.append(str);
            sb.append(";");
        }
        lc3Var.e(4007, sb.toString());
    }

    private static final String d(Context context, lc3 lc3Var) {
        HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
        String c8 = hy3.OS_ARCH.c();
        if (!TextUtils.isEmpty(c8) && hashSet.contains(c8)) {
            return c8;
        }
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null && strArr.length > 0) {
                return strArr[0];
            }
        } catch (IllegalAccessException e8) {
            if (lc3Var != null) {
                lc3Var.c(2024, 0L, e8);
            }
        } catch (NoSuchFieldException e9) {
            if (lc3Var != null) {
                lc3Var.c(2024, 0L, e9);
            }
        }
        String str = Build.CPU_ABI;
        return str != null ? str : Build.CPU_ABI2;
    }
}
