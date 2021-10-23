package IdentityAndAccessContext.Adapter;

import IdentityAndAccessContext.Domain.Admin;

public class IdentitiAndAccessRESTService {
    public static boolean validateAdminID(long adminId) {
        if (findAdminById(adminId) == null){
            return false;
        }
        return true;
    }

    private static Admin findAdminById(long adminId) {
        return findById(adminId);
    }
}
