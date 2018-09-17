package com.business.dao.entity.projectEntity;

public class SspPremises {
    private Integer primaryId;

    private String uuId;

    private Long id;

    private String name;

    private String developer;

    private Integer developerId;

    private String maintainer;

    private Integer maintainerId;

    private String status;

    private String type;

    private Integer city;

    private Integer area;

    private String management;

    private Integer buildNum;

    private Integer houseNum;

    private Float inHouseRate;

    private Integer unitNum;

    private String address;

    private Integer accuratePrice;

    private String housePrice;

    private String housePriceName;

    private String rentPrice;

    private String managementPrice;

    private Integer maxLayer;

    private Long inTime;

    private Integer signElevatorNum;

    private String managementLeader;

    private String managementLeaderPhone;

    private Integer addtime;

    private String addman;

    private Integer uptime;

    private String upman;

    private Integer passtime;

    private String passman;

    private Double positionLng;

    private Double positionLat;

    private String img;

    private Long expirationTime;

    private Integer parkingNum;

    private String parkingPrice;

    private Integer coverNum;

    private String networkType;

    private Integer elevatorNum;

    private Integer minStorey;

    private Integer maxStorey;

    private Integer totalPeople;

    private Integer enterpriseNum;

    private Integer visitorsFlowrate;

    private String boUpPrice;

    private String boDownPrice;

    private String signTime;

    private Integer buildingArea;

    private String contractNum;

    private String remark;

    private String cityCode;

    private String areaCode;

    private String provinceCode;

    private String acreage;

    private String cubageRate;

    private String greeningRate;

    private String buildingType;

    private Integer overgroundParkingNum;

    private Integer chargingPileNum;

    private String developerName;

    private String characteristic;

    private Integer dealDate;

    private String mixImg;

    private String developersName;

    private String competitiveMedia;

    public SspPremises(Integer primaryId, String uuId, Long id, String name, String developer, Integer developerId, String maintainer, Integer maintainerId, String status, String type, Integer city, Integer area, String management, Integer buildNum, Integer houseNum, Float inHouseRate, Integer unitNum, String address, Integer accuratePrice, String housePrice, String housePriceName, String rentPrice, String managementPrice, Integer maxLayer, Long inTime, Integer signElevatorNum, String managementLeader, String managementLeaderPhone, Integer addtime, String addman, Integer uptime, String upman, Integer passtime, String passman, Double positionLng, Double positionLat, String img, Long expirationTime, Integer parkingNum, String parkingPrice, Integer coverNum, String networkType, Integer elevatorNum, Integer minStorey, Integer maxStorey, Integer totalPeople, Integer enterpriseNum, Integer visitorsFlowrate, String boUpPrice, String boDownPrice, String signTime, Integer buildingArea, String contractNum, String remark, String cityCode, String areaCode, String provinceCode, String acreage, String cubageRate, String greeningRate, String buildingType, Integer overgroundParkingNum, Integer chargingPileNum, String developerName, String characteristic, Integer dealDate, String mixImg, String developersName, String competitiveMedia) {
        this.primaryId = primaryId;
        this.uuId = uuId;
        this.id = id;
        this.name = name;
        this.developer = developer;
        this.developerId = developerId;
        this.maintainer = maintainer;
        this.maintainerId = maintainerId;
        this.status = status;
        this.type = type;
        this.city = city;
        this.area = area;
        this.management = management;
        this.buildNum = buildNum;
        this.houseNum = houseNum;
        this.inHouseRate = inHouseRate;
        this.unitNum = unitNum;
        this.address = address;
        this.accuratePrice = accuratePrice;
        this.housePrice = housePrice;
        this.housePriceName = housePriceName;
        this.rentPrice = rentPrice;
        this.managementPrice = managementPrice;
        this.maxLayer = maxLayer;
        this.inTime = inTime;
        this.signElevatorNum = signElevatorNum;
        this.managementLeader = managementLeader;
        this.managementLeaderPhone = managementLeaderPhone;
        this.addtime = addtime;
        this.addman = addman;
        this.uptime = uptime;
        this.upman = upman;
        this.passtime = passtime;
        this.passman = passman;
        this.positionLng = positionLng;
        this.positionLat = positionLat;
        this.img = img;
        this.expirationTime = expirationTime;
        this.parkingNum = parkingNum;
        this.parkingPrice = parkingPrice;
        this.coverNum = coverNum;
        this.networkType = networkType;
        this.elevatorNum = elevatorNum;
        this.minStorey = minStorey;
        this.maxStorey = maxStorey;
        this.totalPeople = totalPeople;
        this.enterpriseNum = enterpriseNum;
        this.visitorsFlowrate = visitorsFlowrate;
        this.boUpPrice = boUpPrice;
        this.boDownPrice = boDownPrice;
        this.signTime = signTime;
        this.buildingArea = buildingArea;
        this.contractNum = contractNum;
        this.remark = remark;
        this.cityCode = cityCode;
        this.areaCode = areaCode;
        this.provinceCode = provinceCode;
        this.acreage = acreage;
        this.cubageRate = cubageRate;
        this.greeningRate = greeningRate;
        this.buildingType = buildingType;
        this.overgroundParkingNum = overgroundParkingNum;
        this.chargingPileNum = chargingPileNum;
        this.developerName = developerName;
        this.characteristic = characteristic;
        this.dealDate = dealDate;
        this.mixImg = mixImg;
        this.developersName = developersName;
        this.competitiveMedia = competitiveMedia;
    }

    public SspPremises() {
        super();
    }

    public Integer getPrimaryId() {
        return primaryId;
    }

    public void setPrimaryId(Integer primaryId) {
        this.primaryId = primaryId;
    }

    public String getUuId() {
        return uuId;
    }

    public void setUuId(String uuId) {
        this.uuId = uuId == null ? null : uuId.trim();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer == null ? null : developer.trim();
    }

    public Integer getDeveloperId() {
        return developerId;
    }

    public void setDeveloperId(Integer developerId) {
        this.developerId = developerId;
    }

    public String getMaintainer() {
        return maintainer;
    }

    public void setMaintainer(String maintainer) {
        this.maintainer = maintainer == null ? null : maintainer.trim();
    }

    public Integer getMaintainerId() {
        return maintainerId;
    }

    public void setMaintainerId(Integer maintainerId) {
        this.maintainerId = maintainerId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public String getManagement() {
        return management;
    }

    public void setManagement(String management) {
        this.management = management == null ? null : management.trim();
    }

    public Integer getBuildNum() {
        return buildNum;
    }

    public void setBuildNum(Integer buildNum) {
        this.buildNum = buildNum;
    }

    public Integer getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(Integer houseNum) {
        this.houseNum = houseNum;
    }

    public Float getInHouseRate() {
        return inHouseRate;
    }

    public void setInHouseRate(Float inHouseRate) {
        this.inHouseRate = inHouseRate;
    }

    public Integer getUnitNum() {
        return unitNum;
    }

    public void setUnitNum(Integer unitNum) {
        this.unitNum = unitNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getAccuratePrice() {
        return accuratePrice;
    }

    public void setAccuratePrice(Integer accuratePrice) {
        this.accuratePrice = accuratePrice;
    }

    public String getHousePrice() {
        return housePrice;
    }

    public void setHousePrice(String housePrice) {
        this.housePrice = housePrice == null ? null : housePrice.trim();
    }

    public String getHousePriceName() {
        return housePriceName;
    }

    public void setHousePriceName(String housePriceName) {
        this.housePriceName = housePriceName == null ? null : housePriceName.trim();
    }

    public String getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(String rentPrice) {
        this.rentPrice = rentPrice == null ? null : rentPrice.trim();
    }

    public String getManagementPrice() {
        return managementPrice;
    }

    public void setManagementPrice(String managementPrice) {
        this.managementPrice = managementPrice == null ? null : managementPrice.trim();
    }

    public Integer getMaxLayer() {
        return maxLayer;
    }

    public void setMaxLayer(Integer maxLayer) {
        this.maxLayer = maxLayer;
    }

    public Long getInTime() {
        return inTime;
    }

    public void setInTime(Long inTime) {
        this.inTime = inTime;
    }

    public Integer getSignElevatorNum() {
        return signElevatorNum;
    }

    public void setSignElevatorNum(Integer signElevatorNum) {
        this.signElevatorNum = signElevatorNum;
    }

    public String getManagementLeader() {
        return managementLeader;
    }

    public void setManagementLeader(String managementLeader) {
        this.managementLeader = managementLeader == null ? null : managementLeader.trim();
    }

    public String getManagementLeaderPhone() {
        return managementLeaderPhone;
    }

    public void setManagementLeaderPhone(String managementLeaderPhone) {
        this.managementLeaderPhone = managementLeaderPhone == null ? null : managementLeaderPhone.trim();
    }

    public Integer getAddtime() {
        return addtime;
    }

    public void setAddtime(Integer addtime) {
        this.addtime = addtime;
    }

    public String getAddman() {
        return addman;
    }

    public void setAddman(String addman) {
        this.addman = addman == null ? null : addman.trim();
    }

    public Integer getUptime() {
        return uptime;
    }

    public void setUptime(Integer uptime) {
        this.uptime = uptime;
    }

    public String getUpman() {
        return upman;
    }

    public void setUpman(String upman) {
        this.upman = upman == null ? null : upman.trim();
    }

    public Integer getPasstime() {
        return passtime;
    }

    public void setPasstime(Integer passtime) {
        this.passtime = passtime;
    }

    public String getPassman() {
        return passman;
    }

    public void setPassman(String passman) {
        this.passman = passman == null ? null : passman.trim();
    }

    public Double getPositionLng() {
        return positionLng;
    }

    public void setPositionLng(Double positionLng) {
        this.positionLng = positionLng;
    }

    public Double getPositionLat() {
        return positionLat;
    }

    public void setPositionLat(Double positionLat) {
        this.positionLat = positionLat;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public Long getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(Long expirationTime) {
        this.expirationTime = expirationTime;
    }

    public Integer getParkingNum() {
        return parkingNum;
    }

    public void setParkingNum(Integer parkingNum) {
        this.parkingNum = parkingNum;
    }

    public String getParkingPrice() {
        return parkingPrice;
    }

    public void setParkingPrice(String parkingPrice) {
        this.parkingPrice = parkingPrice == null ? null : parkingPrice.trim();
    }

    public Integer getCoverNum() {
        return coverNum;
    }

    public void setCoverNum(Integer coverNum) {
        this.coverNum = coverNum;
    }

    public String getNetworkType() {
        return networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType == null ? null : networkType.trim();
    }

    public Integer getElevatorNum() {
        return elevatorNum;
    }

    public void setElevatorNum(Integer elevatorNum) {
        this.elevatorNum = elevatorNum;
    }

    public Integer getMinStorey() {
        return minStorey;
    }

    public void setMinStorey(Integer minStorey) {
        this.minStorey = minStorey;
    }

    public Integer getMaxStorey() {
        return maxStorey;
    }

    public void setMaxStorey(Integer maxStorey) {
        this.maxStorey = maxStorey;
    }

    public Integer getTotalPeople() {
        return totalPeople;
    }

    public void setTotalPeople(Integer totalPeople) {
        this.totalPeople = totalPeople;
    }

    public Integer getEnterpriseNum() {
        return enterpriseNum;
    }

    public void setEnterpriseNum(Integer enterpriseNum) {
        this.enterpriseNum = enterpriseNum;
    }

    public Integer getVisitorsFlowrate() {
        return visitorsFlowrate;
    }

    public void setVisitorsFlowrate(Integer visitorsFlowrate) {
        this.visitorsFlowrate = visitorsFlowrate;
    }

    public String getBoUpPrice() {
        return boUpPrice;
    }

    public void setBoUpPrice(String boUpPrice) {
        this.boUpPrice = boUpPrice == null ? null : boUpPrice.trim();
    }

    public String getBoDownPrice() {
        return boDownPrice;
    }

    public void setBoDownPrice(String boDownPrice) {
        this.boDownPrice = boDownPrice == null ? null : boDownPrice.trim();
    }

    public String getSignTime() {
        return signTime;
    }

    public void setSignTime(String signTime) {
        this.signTime = signTime == null ? null : signTime.trim();
    }

    public Integer getBuildingArea() {
        return buildingArea;
    }

    public void setBuildingArea(Integer buildingArea) {
        this.buildingArea = buildingArea;
    }

    public String getContractNum() {
        return contractNum;
    }

    public void setContractNum(String contractNum) {
        this.contractNum = contractNum == null ? null : contractNum.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    public String getAcreage() {
        return acreage;
    }

    public void setAcreage(String acreage) {
        this.acreage = acreage == null ? null : acreage.trim();
    }

    public String getCubageRate() {
        return cubageRate;
    }

    public void setCubageRate(String cubageRate) {
        this.cubageRate = cubageRate == null ? null : cubageRate.trim();
    }

    public String getGreeningRate() {
        return greeningRate;
    }

    public void setGreeningRate(String greeningRate) {
        this.greeningRate = greeningRate == null ? null : greeningRate.trim();
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType == null ? null : buildingType.trim();
    }

    public Integer getOvergroundParkingNum() {
        return overgroundParkingNum;
    }

    public void setOvergroundParkingNum(Integer overgroundParkingNum) {
        this.overgroundParkingNum = overgroundParkingNum;
    }

    public Integer getChargingPileNum() {
        return chargingPileNum;
    }

    public void setChargingPileNum(Integer chargingPileNum) {
        this.chargingPileNum = chargingPileNum;
    }

    public String getDeveloperName() {
        return developerName;
    }

    public void setDeveloperName(String developerName) {
        this.developerName = developerName == null ? null : developerName.trim();
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic == null ? null : characteristic.trim();
    }

    public Integer getDealDate() {
        return dealDate;
    }

    public void setDealDate(Integer dealDate) {
        this.dealDate = dealDate;
    }

    public String getMixImg() {
        return mixImg;
    }

    public void setMixImg(String mixImg) {
        this.mixImg = mixImg == null ? null : mixImg.trim();
    }

    public String getDevelopersName() {
        return developersName;
    }

    public void setDevelopersName(String developersName) {
        this.developersName = developersName == null ? null : developersName.trim();
    }

    public String getCompetitiveMedia() {
        return competitiveMedia;
    }

    public void setCompetitiveMedia(String competitiveMedia) {
        this.competitiveMedia = competitiveMedia == null ? null : competitiveMedia.trim();
    }
}