# API Handlers

This repository contains handlers for interacting with different APIs.

## DingConnectApiHandler

Handles API requests for the Ding Connect API.

### 1. getCurrencies

Sends a request to retrieve currency information.

#### Parameters

- `apiKey`: The API key required to authenticate the request.
- `callback`: The callback to handle the API response. Implement this callback to define behavior on successful or failed API requests. This callback must implement the `ApiResponseCallback` interface.

#### Example Usage

```java
// Example: Retrieving currency information
DingConnectApiHandler dingConnectApiHandler = new DingConnectApiHandler();

dingConnectApiHandler.getCurrencies(API_KEY, new ApiResponseCallback<Currency>() {
    @Override
    public void onSuccess(Currency result) {
        // Handle successful response here
        // Example: Process the retrieved currency information
    }

    @Override
    public void onError(String errorMessage) {
        // Handle error response here
        // Example: Log the error message or display it to the user
    }
});

```
### 2. getRegions

Sends a request to retrieve region information for a given list of country ISO codes.

#### Parameters

- `apiKey`: The API key required to authenticate the request.
- `countryIsos`: A list of country ISO codes for which region information will be retrieved. Filter the list to regions in countries with the submitted countryIso.
- `callback`: The callback to handle the API response. Implement this callback to define behavior on successful or failed API requests. This callback must implement the `ApiResponseCallback` interface.

#### Example Usage

```java
// Example: Retrieving region information for a list of country ISO codes
DingConnectApiHandler dingConnectApiHandler = new DingConnectApiHandler();
List<String> countryIsos = new ArrayList<>();
countryIsos.add("AD"); // Example country ISO code

dingConnectApiHandler.getRegions(API_KEY, countryIsos, new ApiResponseCallback<Region>() {
    @Override
    public void onSuccess(Region result) {
        // Handle successful response here
        // Example: Process the retrieved region information
    }

    @Override
    public void onError(String errorMessage) {
        // Handle error response here
        // Example: Log the error message or display it to the user
    }
});
```
###  3. getCountries

Sends a request to retrieve country information.

#### Parameters

- `apiKey`: The API key required to authenticate the request.
- `callback`: The callback to handle the API response. Implement this callback to define behavior on successful or failed API requests. This callback must implement the `ApiResponseCallback` interface.

#### Example Usage

```java
// Example: Retrieving country information
DingConnectApiHandler dingConnectApiHandler = new DingConnectApiHandler();

dingConnectApiHandler.getCountries(API_KEY, new ApiResponseCallback<Country>() {
    @Override
    public void onSuccess(Country result) {
        // Handle successful response here
        // Example: Process the retrieved country information
    }

    @Override
    public void onError(String errorMessage) {
        // Handle error response here
        // Example: Log the error message or display it to the user
    }
});
```
###  4. getProviders

Sends a request to retrieve provider information based on the specified parameters.

#### Parameters

- `providerCodes`: A list of provider codes. Filter the list to providers with the submitted provider codes.
- `countryIsos`: A list of country ISO codes. Filter the list to providers in countries with the submitted countryIso.
- `regionCodes`: A list of region codes. Filter the list to providers in regions with the submitted regionCodes.
- `accountNumber`: The account number associated with the request. Filter the list to providers that are valid for the submitted account number. For phone number based products, the account number should be in international phone number format.
- `apiKey`: The API key required to authenticate the request.
- `callback`: The callback to handle the API response. Implement this callback to define behavior on successful or failed API requests. This callback must implement the `ApiResponseCallback` interface.

#### Example Usage

```java
// Example: Retrieving provider information
DingConnectApiHandler dingConnectApiHandler = new DingConnectApiHandler();
List<String> providerCodes = new ArrayList<>();
List<String> countryIsos = new ArrayList<>();
List<String> regionCodes = new ArrayList<>();
String accountNumber = "123456789"; // Example account number

dingConnectApiHandler.getProviders(providerCodes, countryIsos, regionCodes, accountNumber, API_KEY, new ApiResponseCallback<Provider>() {
    @Override
    public void onSuccess(Provider result) {
        // Handle successful response here
        // Example: Process the retrieved provider information
    }

    @Override
    public void onError(String errorMessage) {
        // Handle error response here
        // Example: Log the error message or display it to the user
    }
});
```
###  5. getProviderStatus

Sends a request to retrieve the status of providers based on the specified provider codes.

#### Parameters

- `providerCodes`: A list of provider codes.
- `apiKey`: The API key required to authenticate the request.
- `callback`: The callback to handle the API response. Implement this callback to define behavior on successful or failed API requests. This callback must implement the `ApiResponseCallback` interface.

#### Example Usage

```java
// Example: Retrieving provider status
DingConnectApiHandler dingConnectApiHandler = new DingConnectApiHandler();
List<String> providerCodes = new ArrayList<>();

dingConnectApiHandler.getProviderStatus(providerCodes, API_KEY, new ApiResponseCallback<ProviderStatus>() {
    @Override
    public void onSuccess(ProviderStatus result) {
        // Handle successful response here
        // Example: Process the retrieved provider status information
    }

    @Override
    public void onError(String errorMessage) {
        // Handle error response here
        // Example: Log the error message or display it to the user
    }
});
```
###  6. getProducts

Sends a request to retrieve product information based on the specified parameters.

#### Parameters

- `countryIsos`: A list of country ISO codes. Filter the list to products for countries with the given ISOs.
- `providerCodes`: A list of provider codes. Filter the list to products supplied by providers with the submitted provider codes.
- `skuCodes`: A list of SKU (Stock Keeping Unit) codes. Filter the list to products with the submitted SkuCodes.
- `benefits`: A list of benefits. Filter the list to products with the listed benefits.
- `regionCodes`: A list of region codes. Filter the list to products in regions with the submitted regionCodes.
- `accountNumber`: The account number associated with the request. Filter the list to products that are valid for the submitted account number. For phone number based products, the account number should be in international phone number format.
- `apiKey`: The API key required to authenticate the request.
- `callback`: The callback to handle the API response. Implement this callback to define behavior on successful or failed API requests. This callback must implement the `ApiResponseCallback` interface.

#### Example Usage

```java
// Example: Retrieving product information
DingConnectApiHandler dingConnectApiHandler = new DingConnectApiHandler();
List<String> countryIsos = new ArrayList<>();
List<String> providerCodes = new ArrayList<>();
List<String> skuCodes = new ArrayList<>();
List<String> benefits = new ArrayList<>();
List<String> regionCodes = new ArrayList<>();
String accountNumber = "123456789"; // Example account number

dingConnectApiHandler.getProducts(countryIsos, providerCodes, skuCodes, benefits, regionCodes, accountNumber, API_KEY, new ApiResponseCallback<Product>() {
    @Override
    public void onSuccess(Product result) {
        // Handle successful response here
        // Example: Process the retrieved product information
    }

    @Override
    public void onError(String errorMessage) {
        // Handle error response here
        // Example: Log the error message or display it to the user
    }
});
```
###  7. getProductDescriptions

Sends a request to retrieve product descriptions based on the specified parameters.

#### Parameters

- `languageCodes`: A list of language codes. Filter the list to product descriptions with the submitted language codes.
- `skuCodes`: A list of SKU (Stock Keeping Unit) codes. Filter the list to descriptions for products with the submitted SkuCodes.
- `apiKey`: The API key required to authenticate the request.
- `callback`: The callback to handle the API response. Implement this callback to define behavior on successful or failed API requests. This callback must implement the `ApiResponseCallback` interface.

#### Example Usage

```java
// Example: Retrieving product descriptions
DingConnectApiHandler dingConnectApiHandler = new DingConnectApiHandler();
List<String> languageCodes = new ArrayList<>();
List<String> skuCodes = new ArrayList<>();

dingConnectApiHandler.getProductDescriptions(languageCodes, skuCodes, API_KEY, new ApiResponseCallback<ProductDescription>() {
    @Override
    public void onSuccess(ProductDescription result) {
        // Handle successful response here
        // Example: Process the retrieved product descriptions
    }

    @Override
    public void onError(String errorMessage) {
        // Handle error response here
        // Example: Log the error message or display it to the user
    }
});
```
###  8. getAccountLookup

Sends a request to retrieve account lookup information based on the specified parameters.

#### Parameters

- `accountNumber`: The account number associated with the request. For phone number based products, the account number should be in international phone number format.
- `apiKey`: The API key required to authenticate the request.
- `callback`: The callback to handle the API response. Implement this callback to define behavior on successful or failed API requests. This callback must implement the `ApiResponseCallback` interface.

#### Example Usage

```java
// Example: Retrieving account lookup information
DingConnectApiHandler dingConnectApiHandler = new DingConnectApiHandler();
String accountNumber = "123456789"; // Example account number

dingConnectApiHandler.getAccountLookup(accountNumber, API_KEY, new ApiResponseCallback<AccountLookup>() {
    @Override
    public void onSuccess(AccountLookup result) {
        // Handle successful response here
        // Example: Process the retrieved account lookup information
    }

    @Override
    public void onError(String errorMessage) {
        // Handle error response here
        // Example: Log the error message or display it to the user
    }
});
```
###  9. getErrorCodeDescriptions

Sends a request to retrieve descriptions for error codes.

#### Parameters

- `apiKey`: The API key required to authenticate the request.
- `callback`: The callback to handle the API response. Implement this callback to define behavior on successful or failed API requests. This callback must implement the `ApiResponseCallback` interface.

#### Example Usage

```java
// Example: Retrieving descriptions for error codes
DingConnectApiHandler dingConnectApiHandler = new DingConnectApiHandler();

dingConnectApiHandler.getErrorCodeDescriptions(API_KEY, new ApiResponseCallback<ErrorCodeDescription>() {
    @Override
    public void onSuccess(ErrorCodeDescription result) {
        // Handle successful response here
        // Example: Process the retrieved error code descriptions
    }

    @Override
    public void onError(String errorMessage) {
        // Handle error response here
        // Example: Log the error message or display it to the user
    }
});
```
##  10. getBalance

Sends a request to retrieve account balance information.

### Parameters

- `API_KEY`: The API key required to authenticate the request.
- `callback`: The callback to handle the API response. Implement this callback to define behavior on successful or failed API requests. This callback must implement the `ApiResponseCallback` interface.

### Example Usage

```java
// Initialize the DingConnectApiHandler
DingConnectApiHandler dingConnectApiHandler = new DingConnectApiHandler();

// Retrieve account balance information
dingConnectApiHandler.getBalance(API_KEY, new ApiResponseCallback<Balance>() {
    @Override
    public void onSuccess(Balance result) {
        // Handle successful response here
    }

    @Override
    public void onError(String errorMessage) {
        // Handle error response here
    }
});
```
##  11. getPromotions

Sends a request to retrieve promotions based on the specified parameters.

### Parameters

- `countryIsos`: A list of country ISO codes. Filter the list to promotions for countries with the given ISOs.
- `providerCodes`: A list of provider codes. Filter the list to promotions on products supplied by providers with the submitted provider codes.
- `accountNumber`: The account number associated with the request. Filter the list to promotions on products that are valid for the submitted account number. For phone number based products, the account number should be in international phone number format.
- `API_KEY`: The API key required to authenticate the request.
- `callback`: The callback to handle the API response. Implement this callback to define behavior on successful or failed API requests. This callback must implement the `ApiResponseCallback` interface.

### Example Usage

```java
// Initialize the DingConnectApiHandler
DingConnectApiHandler dingConnectApiHandler = new DingConnectApiHandler();
List<String> providerCodes = new ArrayList<>();
List<String> countryIsos = new ArrayList<>();
String accountNumber = "123456789";
// Retrieve promotions
dingConnectApiHandler.getPromotions(countryIsos, providerCodes, accountNumber, API_KEY, new ApiResponseCallback<Promotion>() {
    @Override
    public void onSuccess(Promotion result) {
        // Handle successful response here
    }

    @Override
    public void onError(String errorMessage) {
        // Handle error response here
    }
});
```
##  12. getPromotionDescriptions

Sends a request to retrieve promotion descriptions based on the specified parameters.

### Parameters

- `languageCodes`: A list of language codes. Filter the list to promotion descriptions with the submitted language codes.
- `API_KEY`: The API key required to authenticate the request.
- `callback`: The callback to handle the API response. Implement this callback to define behavior on successful or failed API requests. This callback must implement the `ApiResponseCallback` interface.

### Example Usage

```java
// Initialize the DingConnectApiHandler
DingConnectApiHandler dingConnectApiHandler = new DingConnectApiHandler();

// Retrieve promotion descriptions
dingConnectApiHandler.getPromotionDescriptions(languageCodes, API_KEY, new ApiResponseCallback<PromotionDescription>() {
    @Override
    public void onSuccess(PromotionDescription result) {
        // Handle successful response here
    }

    @Override
    public void onError(String errorMessage) {
        // Handle error response here
    }
});
```
## 13. sendTransfer

Sends a request to transfer funds with the specified parameters.

### Parameters

- `apiKey`: The API key required to authenticate the request.
- `request`: An instance of the `SendTransferRequest` class containing parameters for the transfer.
- `callback`: The callback to handle the API response. Implement this callback to define behavior on successful or failed API requests. This callback must implement the `ApiResponseCallback` interface.

### Example Usage

```java
// Initialize the DingConnectApiHandler
DingConnectApiHandler dingConnectApiHandler = new DingConnectApiHandler();

// Create a SendTransferRequest object with required parameters
SendTransferRequest sendTransferRequest = new SendTransferRequest();
sendTransferRequest.setSkuCode("SKU123"); //(Required) Code provided by GetProducts API
sendTransferRequest.setSendValue(100); // (Required) The transfer value to be sent. Specified to two decimal places of accuracy of the major currency unit, e.g. 3.17 USD.
sendTransferRequest.setAccountNumber("123456789"); // (Required) The account number to target
sendTransferRequest.setDistributorRef("wef"); //(Required) Unique identifier in the distributor system to be associated with the transfer
sendTransferRequest.setValidateOnly(true); // (Required) Validate the request with the provider without doing a transfer
sendTransferRequest.setSettings(settings); // Product specific name/value pairs to be associated with the transfer request. It should be list of setting
sendTransferRequest.setSendCurrencyIso("USD"); //The currency of the `SendValue`. If this is null or empty, we will assume distributor currency.
sendTransferRequest.setBillRef("true"); // Bill reference. Required when product has "LookupBillsRequired" set to true.

// Send transfer request
dingConnectApiHandler.sendTransfer(API_KEY, sendTransferRequest, new ApiResponseCallback<TransferRecordResponse>() {
    @Override
    public void onSuccess(TransferRecordResponse result) {
        // Handle successful response here
    }

    @Override
    public void onError(String errorMessage) {
        // Handle error response here
    }
});
```
## 14. estimatePrices

Sends a request to estimate prices for multiple transfers with the specified parameters.

### Parameters

- `apiKey`: The API key required to authenticate the request.
- `request`: A list of `EstimatePriceRequest` objects containing parameters for each transfer.
- `callback`: The callback to handle the API response. Implement this callback to define behavior on successful or failed API requests. This callback must implement the `ApiResponseCallback` interface.

### Example Usage

```java
// Initialize the DingConnectApiHandler
DingConnectApiHandler dingConnectApiHandler = new DingConnectApiHandler();

// Create a list of EstimatePriceRequest objects with required parameters
List<EstimatePriceRequest> estimatePriceRequest = new ArrayList<>();
EstimatePriceRequest request1 = new EstimatePriceRequest();
request1.setSendValue(100);
request1.setSendCurrencyIso("USD");
request1.setReceiveValue(0);
request1.setSkuCode("SKU123");
request1.setBatchItemRef("Batch1");

EstimatePriceRequest request2 = new EstimatePriceRequest();
request2.setSendValue(200);
request2.setSendCurrencyIso("EUR");
request2.setReceiveValue(0);
request2.setSkuCode("SKU456");
request2.setBatchItemRef("Batch2");

estimatePriceRequest.add(request1);
estimatePriceRequest.add(request2);
// Add more EstimatePriceRequest objects as needed

// Send estimate prices request
dingConnectApiHandler.estimatePrices(API_KEY, estimatePriceRequest, new ApiResponseCallback<EstimatePrice>() {
    @Override
    public void onSuccess(EstimatePrice result) {
        // Handle successful response here
    }

    @Override
    public void onError(String errorMessage) {
        // Handle error response here
    }
});
```
## 15. listTransferRecords

Sends a request to list transfer records based on the specified parameters.

### Parameters

- `apiKey`: The API key required to authenticate the request.
- `request`: An instance of the `ListTransferRecordRequest` class containing parameters for the transfer record listing.
- `callback`: The callback to handle the API response. Implement this callback to define behavior on successful or failed API requests. This callback must implement the `ApiResponseCallback` interface.

### Example Usage

```java
// Initialize the DingConnectApiHandler
DingConnectApiHandler dingConnectApiHandler = new DingConnectApiHandler();

// Create a ListTransferRecordRequest object with required parameters
ListTransferRecordRequest listTransferRecordRequest = new ListTransferRecordRequest();
listTransferRecordRequest.setTransferRef("Transfer123"); // Filter by Ding TransferRef
listTransferRecordRequest.setDistributorRef("Distributor123"); // Filter transfers by DistributorRef.
listTransferRecordRequest.setAccountNumber("123456789"); // Filter transfers by AccountNumber
listTransferRecordRequest.setSkip(0); //The amount of records to by-pass before returning the remaining records
listTransferRecordRequest.setTake(10); // (Required) The amount of records to return

// Send list transfer records request
dingConnectApiHandler.listTransferRecords(API_KEY, listTransferRecordRequest, new ApiResponseCallback<ListTransferRecord>() {
    @Override
    public void onSuccess(ListTransferRecord result) {
        // Handle successful response here
    }

    @Override
    public void onError(String errorMessage) {
        // Handle error response here
    }
});
```
## 16. cancelTransfers

Sends a request to cancel transfers based on the specified parameters.

### Parameters

- `apiKey`: The API key required to authenticate the request.
- `request`: An instance of the `CancelTransfersRequest` class containing parameters for cancelling transfers.
- `callback`: The callback to handle the API response. Implement this callback to define behavior on successful or failed API requests. This callback must implement the `ApiResponseCallback` interface.

### Example Usage

```java
// Initialize the DingConnectApiHandler
DingConnectApiHandler dingConnectApiHandler = new DingConnectApiHandler();

// Create a CancelTransfersRequest object with required parameters
CancelTransfersRequest cancelTransfersRequest = new CancelTransfersRequest();
List<CancelTransferItem> cancelTransferItems = new ArrayList<>();

// Create CancelTransferItem objects and add them to the list
CancelTransferItem cancelTransferItem1 = new CancelTransferItem();
TransferId transferId1 = new TransferId();
transferId1.setTransferRef("TransferRef1");
transferId1.setDistributorRef("DistributorRef1");
cancelTransferItem1.setTransferId(transferId1);
cancelTransferItem1.setBatchItemRef("BatchItemRef1");

CancelTransferItem cancelTransferItem2 = new CancelTransferItem();
TransferId transferId2 = new TransferId();
transferId2.setTransferRef("TransferRef2");
transferId2.setDistributorRef("DistributorRef2");
cancelTransferItem2.setTransferId(transferId2);
cancelTransferItem2.setBatchItemRef("BatchItemRef2");

cancelTransferItems.add(cancelTransferItem1);
cancelTransferItems.add(cancelTransferItem2);

cancelTransfersRequest.setCancelTransferItems(cancelTransferItems);

// Send cancel transfers request
dingConnectApiHandler.cancelTransfers(API_KEY, cancelTransfersRequest, new ApiResponseCallback<CancelTransfer>() {
    @Override
    public void onSuccess(CancelTransfer result) {
        // Handle successful response here
    }

    @Override
    public void onError(String errorMessage) {
        // Handle error response here
    }
});
```
## 17. lookupBills

Sends a request to lookup bills based on the specified parameters.

### Parameters

- `apiKey`: The API key required to authenticate the request.
- `request`: An instance of the `LookupBillsRequest` class containing parameters for bill lookup.
- `callback`: The callback to handle the API response. Implement this callback to define behavior on successful or failed API requests. This callback must implement the `ApiResponseCallback` interface.

### Example Usage

```java
// Initialize the DingConnectApiHandler
DingConnectApiHandler dingConnectApiHandler = new DingConnectApiHandler();

// Create a LookupBillsRequest object with required parameters
LookupBillsRequest lookupBillsRequest = new LookupBillsRequest();
lookupBillsRequest.setSkuCode("SKU123"); // (Required) Code provided by GetProducts API
lookupBillsRequest.setAccountNumber("123456789"); //(Required) The account number to target

// Create a list of settings
List<Setting> settings = new ArrayList<>();
Setting setting1 = new Setting();
setting1.setName("SettingName1"); // Product specific name/value pairs to be associated with the lookup bills request
setting1.setValue("SettingValue1"); // Product specific name/value pairs to be associated with the lookup bills request
// Add more settings as needed
settings.add(setting1);
lookupBillsRequest.setSettings(settings);

// Send lookup bills request
dingConnectApiHandler.lookupBills(API_KEY, lookupBillsRequest, new ApiResponseCallback<LookupBill>() {
    @Override
    public void onSuccess(LookupBill result) {
        // Handle successful response here
    }

    @Override
    public void onError(String errorMessage) {
        // Handle error response here
    }
});
```
