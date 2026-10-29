package v;

import java.util.ArrayList;

/* compiled from: MyApplication */
public abstract class b {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        if (r8 == 2) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0035, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0047, code lost:
    
        if (r8 == 2) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x025d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x038b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0395 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0499 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b2  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [v.e] */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r4v44, types: [v.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void a(v.f r37, s.d r38, int r39, int r40, v.c r41) {
        /*
            Method dump skipped, instructions count: 1287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v.b.a(v.f, s.d, int, int, v.c):void");
    }

    public static void b(f fVar, s.d dVar, ArrayList arrayList, int i7) {
        int i8;
        c[] cVarArr;
        int i9;
        if (i7 == 0) {
            i8 = fVar.W0;
            cVarArr = fVar.Z0;
            i9 = 0;
        } else {
            i8 = fVar.X0;
            cVarArr = fVar.Y0;
            i9 = 2;
        }
        for (int i10 = 0; i10 < i8; i10++) {
            c cVar = cVarArr[i10];
            cVar.a();
            if (arrayList == null || arrayList.contains(cVar.f26579a)) {
                a(fVar, dVar, i7, i9, cVar);
            }
        }
    }
}
