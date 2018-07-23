package com.qubaba;


import de.schlichtherle.license.LicenseManager;
import de.schlichtherle.license.LicenseParam;

/**
 * @ClassName LicenseManagerHolder
 * @Description TODO
 * @Auth qp
 * @Date 2018/7/23 21:35
 */
public class LicenseManagerHolder {

    private static LicenseManager licenseManager;

    public static synchronized LicenseManager getLicenseManager(LicenseParam licenseParams) {
        if (licenseManager == null) {
            licenseManager = new LicenseManager(licenseParams);
        }
        return licenseManager;
    }
}
