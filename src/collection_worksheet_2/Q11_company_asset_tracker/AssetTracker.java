package collection_worksheet_2.Q11_company_asset_tracker;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AssetTracker
{
    private Map<String ,Set<Asset>> deptAsset= new HashMap<>();
    private Set<String> allassetid = new HashSet<>();

    public void addAsset(String department, Asset asset) {
        // Check for duplicate asset ID
        if (allassetid.contains(asset.getId())) {
            System.out.println("Duplicate asset ID detected: " + asset.getId());
            return;
        }
        if (!deptAsset.containsKey(department)) {
            Set<Asset> assets = new HashSet<>();
            assets.add(asset);
            deptAsset.put(department, assets);
        } else {
            Set<Asset> assets = deptAsset.get(department);
            assets.add(asset);
        }
        allassetid.add(asset.getId());
        System.out.println("Asset added successfully.");
    }

    public void printAllAssets() {
        System.out.println("Company Asset Report:");
        for (String department : deptAsset.keySet()) {
            System.out.println("Department: " + department);
            for (Asset asset : deptAsset.get(department)) {
                System.out.println("  " + asset);
            }
        }
    }

}
