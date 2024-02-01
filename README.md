# API Handlers

This repository contains handlers for interacting with different APIs.

## Ding Connect ApiHandler

Handles API requests for the Ding Connect API.

## 1. getCurrencies

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
## 2. getRegions

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
##  3. getCountries

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
##  4. getProviders

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
##  5. getProviderStatus

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
##  6. getProducts

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
##  7. getProductDescriptions

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
##  8. getAccountLookup

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
##  9. getErrorCodeDescriptions

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
## You Got A Gift ApiHandler

Handles API requests for the You Got A Gift API.
## 1. getCurrencies

This method retrieves currencies from the YouGotAGift API.

### Parameters

- `apiKey`: The API key required to authenticate the request.
- `callback`: An instance of `ApiResponseCallback<CurrencyResponse>` to handle the API response. It defines two methods:
  - `onSuccess`: Called when the API request is successful, receiving a `CurrencyResponse` object.
  - `onError`: Called if there is an error during the API request, receiving an error message.

### Example Usage

```java
// Initialize the YouGotAGiftApiHandler
YouGotAGiftApiHandler youGotAGiftApiHandler = new YouGotAGiftApiHandler();

// Make an API call to get currencies
youGotAGiftApiHandler.getCurrencies(API_KEY, new ApiResponseCallback<CurrencyResponse>() {
    @Override
    public void onSuccess(CurrencyResponse result) {
        // Handle successful response here
    }

    @Override
    public void onError(String errorMessage) {
        // Handle error response here
    }
});
```
## 2. getAccount

This method retrieves account information from the YouGotAGift API.

### Parameters

- `apiKey`: The API key required to authenticate the request.
- `callback`: An instance of `ApiResponseCallback<AccountResponse>` to handle the API response. It defines two methods:
  - `onSuccess`: Called when the API request is successful, receiving an `AccountResponse` object.
  - `onError`: Called if there is an error during the API request, receiving an error message.

### Example Usage

```java
// Initialize the YouGotAGiftApiHandler
YouGotAGiftApiHandler youGotAGiftApiHandler = new YouGotAGiftApiHandler();

// Make an API call to get account information
youGotAGiftApiHandler.getAccount(API_KEY, new ApiResponseCallback<AccountResponse>() {
    @Override
    public void onSuccess(AccountResponse result) {
        // Handle successful response here
    }

    @Override
    public void onError(String errorMessage) {
        // Handle error response here
    }
});
```
## 3. searchOrderByGiftCode

This method searches for an order by gift code from the YouGotAGift API.

### Parameters

- `apiKey`: The API key required to authenticate the request.
- `code`: The gift code used to search for the order.
- `callback`: An instance of `ApiResponseCallback<OrderResponse>` to handle the API response. It defines two methods:
  - `onSuccess`: Called when the API request is successful, receiving an `OrderResponse` object.
  - `onError`: Called if there is an error during the API request, receiving an error message.

### Example Usage

```java
// Initialize the YouGotAGiftApiHandler
YouGotAGiftApiHandler youGotAGiftApiHandler = new YouGotAGiftApiHandler();

// Gift code to search for
String code = "1234";

// Make an API call to search for an order by gift code
youGotAGiftApiHandler.searchOrderByGiftCode(API_KEY, code, new ApiResponseCallback<OrderResponse>() {
    @Override
    public void onSuccess(OrderResponse result) {
        // Handle successful response here
    }

    @Override
    public void onError(String errorMessage) {
        // Handle error response here
    }
});
```
## 4. searchOrderByOrderId

This method searches for an order by order ID from the YouGotAGift API.

### Parameters

- `apiKey`: The API key required to authenticate the request.
- `orderId`: The order ID used to search for the order.
- `callback`: An instance of `ApiResponseCallback<OrderResponse>` to handle the API response. It defines two methods:
  - `onSuccess`: Called when the API request is successful, receiving an `OrderResponse` object.
  - `onError`: Called if there is an error during the API request, receiving an error message.

### Example Usage

```java
// Initialize the YouGotAGiftApiHandler
YouGotAGiftApiHandler youGotAGiftApiHandler = new YouGotAGiftApiHandler();

// Order ID to search for
String orderId = "12345";

// Make an API call to search for an order by order ID
youGotAGiftApiHandler.searchOrderByOrderId(API_KEY, orderId, new ApiResponseCallback<OrderResponse>() {
    @Override
    public void onSuccess(OrderResponse result) {
        // Handle successful response here
    }

    @Override
    public void onError(String errorMessage) {
        // Handle error response here
    }
});
```
##  5. listAllDigitalOrders

This method retrieves a list of all digital orders from the YouGotAGift API.

### Parameters

- `apiKey`: The API key required to authenticate the request.
- `notify`: A boolean value indicating whether to notify about the orders.
- `fromDate`: The start date for filtering orders.
- `toDate`: The end date for filtering orders.
- `callback`: An instance of `ApiResponseCallback<OrderResponse>` to handle the API response. It defines two methods:
  - `onSuccess`: Called when the API request is successful, receiving an `OrderResponse` object.
  - `onError`: Called if there is an error during the API request, receiving an error message.

### Example Usage

```java
// Initialize the YouGotAGiftApiHandler
YouGotAGiftApiHandler youGotAGiftApiHandler = new YouGotAGiftApiHandler();

// Set parameters
String apiKey = "YOUR_API_KEY";
boolean notify = true;
String fromDate = "2024-01-01";
String toDate = "2024-02-01";

// Make an API call to retrieve all digital orders
youGotAGiftApiHandler.listAllDigitalOrders(apiKey, notify, fromDate, toDate, new ApiResponseCallback<OrderResponse>() {
    @Override
    public void onSuccess(OrderResponse result) {
        // Handle successful response here
    }

    @Override
    public void onError(String errorMessage) {
        // Handle error response here
    }
});
```
## 6. listOrdersPlacedInCountry

This method retrieves a list of orders placed in a specific country from the YouGotAGift API.

### Parameters

- `apiKey`: The API key required to authenticate the request.
- `country`: The ISO code of the country for which to retrieve orders.
- `fromDate`: The start date for filtering orders.
- `toDate`: The end date for filtering orders.
- `callback`: An instance of `ApiResponseCallback<OrderResponse>` to handle the API response. It defines two methods:
  - `onSuccess`: Called when the API request is successful, receiving an `OrderResponse` object.
  - `onError`: Called if there is an error during the API request, receiving an error message.

### Example Usage

```java
// Initialize the YouGotAGiftApiHandler
YouGotAGiftApiHandler youGotAGiftApiHandler = new YouGotAGiftApiHandler();

// Set parameters
String apiKey = "YOUR_API_KEY";
String country = "US";
String fromDate = "2024-01-01";
String toDate = "2024-02-01";

// Make an API call to retrieve orders placed in a specific country
youGotAGiftApiHandler.listOrdersPlacedInCountry(apiKey, country, fromDate, toDate, new ApiResponseCallback<OrderResponse>() {
    @Override
    public void onSuccess(OrderResponse result) {
        // Handle successful response here
    }

    @Override
    public void onError(String errorMessage) {
        // Handle error response here
    }
});
```
## 7. listOrdersPlacedInBrand

This method retrieves a list of orders placed for a specific brand from the YouGotAGift API.

### Parameters

- `apiKey`: The API key required to authenticate the request.
- `brandCode`: The code of the brand for which to retrieve orders.
- `fromDate`: The start date for filtering orders.
- `toDate`: The end date for filtering orders.
- `callback`: An instance of `ApiResponseCallback<OrderResponse>` to handle the API response. It defines two methods:
  - `onSuccess`: Called when the API request is successful, receiving an `OrderResponse` object.
  - `onError`: Called if there is an error during the API request, receiving an error message.

### Example Usage

```java
// Initialize the YouGotAGiftApiHandler
YouGotAGiftApiHandler youGotAGiftApiHandler = new YouGotAGiftApiHandler();

// Set parameters
String apiKey = "YOUR_API_KEY";
String brandCode = "BRAND_CODE";
String fromDate = "2024-01-01";
String toDate = "2024-02-01";

// Make an API call to retrieve orders placed for a specific brand
youGotAGiftApiHandler.listOrdersPlacedInBrand(apiKey, brandCode, fromDate, toDate, new ApiResponseCallback<OrderResponse>() {
    @Override
    public void onSuccess(OrderResponse result) {
        // Handle successful response here
    }

    @Override
    public void onError(String errorMessage) {
        // Handle error response here
    }
});
```
## 8. listOrdersByPage

This method retrieves a list of orders by page from the YouGotAGift API.

### Parameters

- `apiKey`: The API key required to authenticate the request.
- `page`: The page number of the orders to retrieve.
- `fromDate`: The start date for filtering orders.
- `toDate`: The end date for filtering orders.
- `callback`: An instance of `ApiResponseCallback<OrderResponse>` to handle the API response. It defines two methods:
  - `onSuccess`: Called when the API request is successful, receiving an `OrderResponse` object.
  - `onError`: Called if there is an error during the API request, receiving an error message.

### Example Usage

```java
// Initialize the YouGotAGiftApiHandler
YouGotAGiftApiHandler youGotAGiftApiHandler = new YouGotAGiftApiHandler();

// Set parameters
String apiKey = "YOUR_API_KEY";
int page = 1; // Example page number
String fromDate = "2024-01-01";
String toDate = "2024-02-01";

// Make an API call to retrieve orders by page
youGotAGiftApiHandler.listOrdersByPage(apiKey, page, fromDate, toDate, new ApiResponseCallback<OrderResponse>() {
    @Override
    public void onSuccess(OrderResponse result) {
        // Handle successful response here
    }

    @Override
    public void onError(String errorMessage) {
        // Handle error response here
    }
});
```
## getAllBrands

This method retrieves a list of all brands from the YouGotAGift API.

### Parameters

- `apiKey`: The API key required to authenticate the request.
- `callback`: An instance of `ApiResponseCallback<BrandResponse>` to handle the API response. It defines two methods:
  - `onSuccess`: Called when the API request is successful, receiving a `BrandResponse` object.
  - `onError`: Called if there is an error during the API request, receiving an error message.

### Example Usage

```java
// Initialize the YouGotAGiftApiHandler
YouGotAGiftApiHandler youGotAGiftApiHandler = new YouGotAGiftApiHandler();

// Set parameters
String apiKey = "YOUR_API_KEY";

// Make an API call to retrieve all brands
youGotAGiftApiHandler.getAllBrands(apiKey, new ApiResponseCallback<BrandResponse>() {
    @Override
    public void onSuccess(BrandResponse result) {
        // Handle successful response here
    }

    @Override
    public void onError(String errorMessage) {
        // Handle error response here
    }
});
```
## getBrandsByCountry

This method retrieves a list of brands based on the specified country from the YouGotAGift API.

### Parameters

- `apiKey`: The API key required to authenticate the request.
- `country`: The ISO code of the country for which to retrieve brands.
- `callback`: An instance of `ApiResponseCallback<BrandResponse>` to handle the API response. It defines two methods:
  - `onSuccess`: Called when the API request is successful, receiving a `BrandResponse` object.
  - `onError`: Called if there is an error during the API request, receiving an error message.

### Example Usage

```java
// Initialize the YouGotAGiftApiHandler
YouGotAGiftApiHandler youGotAGiftApiHandler = new YouGotAGiftApiHandler();

// Set parameters
String apiKey = "YOUR_API_KEY";
String country = "COUNTRY_ISO_CODE";

// Make an API call to retrieve brands by country
youGotAGiftApiHandler.getBrandsByCountry(apiKey, country, new ApiResponseCallback<BrandResponse>() {
    @Override
    public void onSuccess(BrandResponse result) {
        // Handle successful response here
    }

    @Override
    public void onError(String errorMessage) {
        // Handle error response here
    }
});
```
## getBrandByCode

This method retrieves a brand based on the specified brand code from the YouGotAGift API.

### Parameters

- `apiKey`: The API key required to authenticate the request.
- `brandCode`: The code of the brand to retrieve.
- `callback`: An instance of `ApiResponseCallback<BrandResponse>` to handle the API response. It defines two methods:
  - `onSuccess`: Called when the API request is successful, receiving a `BrandResponse` object.
  - `onError`: Called if there is an error during the API request, receiving an error message.

### Example Usage

```java
// Initialize the YouGotAGiftApiHandler
YouGotAGiftApiHandler youGotAGiftApiHandler = new YouGotAGiftApiHandler();

// Set parameters
String apiKey = "YOUR_API_KEY";
String brandCode = "BRAND_CODE";

// Make an API call to retrieve a brand by code
youGotAGiftApiHandler.getBrandByCode(apiKey, brandCode, new ApiResponseCallback<BrandResponse>() {
    @Override
    public void onSuccess(BrandResponse result) {
        // Handle successful response here
    }

    @Override
    public void onError(String errorMessage) {
        // Handle error response here
    }
});
```
## getBrandByName

This method retrieves a brand based on the specified name from the YouGotAGift API.

### Parameters

- `apiKey`: The API key required to authenticate the request.
- `name`: The name of the brand to retrieve.
- `callback`: An instance of `ApiResponseCallback<BrandResponse>` to handle the API response. It defines two methods:
  - `onSuccess`: Called when the API request is successful, receiving a `BrandResponse` object.
  - `onError`: Called if there is an error during the API request, receiving an error message.

### Example Usage

```java
// Initialize the YouGotAGiftApiHandler
YouGotAGiftApiHandler youGotAGiftApiHandler = new YouGotAGiftApiHandler();

// Set parameters
String apiKey = "YOUR_API_KEY";
String name = "BRAND_NAME";

// Make an API call to retrieve a brand by name
youGotAGiftApiHandler.getBrandByName(apiKey, name, new ApiResponseCallback<BrandResponse>() {
    @Override
    public void onSuccess(BrandResponse result) {
        // Handle successful response here
    }

    @Override
    public void onError(String errorMessage) {
        // Handle error response here
    }
});
```
## getActiveBrands

This method retrieves a list of active brands from the YouGotAGift API.

### Parameters

- `apiKey`: The API key required to authenticate the request.
- `isActive`: A boolean indicating whether to retrieve active brands (`true`) or inactive brands (`false`).
- `callback`: An instance of `ApiResponseCallback<BrandResponse>` to handle the API response. It defines two methods:
  - `onSuccess`: Called when the API request is successful, receiving a `BrandResponse` object.
  - `onError`: Called if there is an error during the API request, receiving an error message.

### Example Usage

```java
// Initialize the YouGotAGiftApiHandler
YouGotAGiftApiHandler youGotAGiftApiHandler = new YouGotAGiftApiHandler();

// Set parameters
String apiKey = "YOUR_API_KEY";
boolean isActive = true;

// Make an API call to retrieve active brands
youGotAGiftApiHandler.getActiveBrands(apiKey, isActive, new ApiResponseCallback<BrandResponse>() {
    @Override
    public void onSuccess(BrandResponse result) {
        // Handle successful response here
    }

    @Override
    public void onError(String errorMessage) {
        // Handle error response here
    }
});
```
## getBrandsByCategoryId

This method retrieves a list of brands associated with a specific category ID from the YouGotAGift API.

### Parameters

- `apiKey`: The API key required to authenticate the request.
- `categoryId`: The ID of the category for which to retrieve brands.
- `callback`: An instance of `ApiResponseCallback<BrandResponse>` to handle the API response. It defines two methods:
  - `onSuccess`: Called when the API request is successful, receiving a `BrandResponse` object.
  - `onError`: Called if there is an error during the API request, receiving an error message.

### Example Usage

```java
// Initialize the YouGotAGiftApiHandler
YouGotAGiftApiHandler youGotAGiftApiHandler = new YouGotAGiftApiHandler();

// Set parameters
String apiKey = "YOUR_API_KEY";
int categoryId = 123; // Replace with the desired category ID

// Make an API call to retrieve brands by category ID
youGotAGiftApiHandler.getBrandsByCategoryId(apiKey, categoryId, new ApiResponseCallback<BrandResponse>() {
    @Override
    public void onSuccess(BrandResponse result) {
        // Handle successful response here
    }

    @Override
    public void onError(String errorMessage) {
        // Handle error response here
    }
});
```
## getBrandLocations

This method retrieves locations associated with a specific brand code from the YouGotAGift API.

### Parameters

- `apiKey`: The API key required to authenticate the request.
- `brandCode`: The code of the brand for which to retrieve locations.
- `callback`: An instance of `ApiResponseCallback<BrandLocationResponse>` to handle the API response. It defines two methods:
  - `onSuccess`: Called when the API request is successful, receiving a `BrandLocationResponse` object.
  - `onError`: Called if there is an error during the API request, receiving an error message.

### Example Usage

```java
// Initialize the YouGotAGiftApiHandler
YouGotAGiftApiHandler youGotAGiftApiHandler = new YouGotAGiftApiHandler();

// Set parameters
String apiKey = "YOUR_API_KEY";
String brandCode = "BRAND_CODE"; // Replace with the desired brand code

// Make an API call to retrieve brand locations
youGotAGiftApiHandler.getBrandLocations(apiKey, brandCode, new ApiResponseCallback<BrandLocationResponse>() {
    @Override
    public void onSuccess(BrandLocationResponse result) {
        // Handle successful response here
    }

    @Override
    public void onError(String errorMessage) {
        // Handle error response here
    }
});
```
## getLocationByCityId

This method retrieves location details associated with a specific city ID and brand code from the YouGotAGift API.

### Parameters

- `apiKey`: The API key required to authenticate the request.
- `brandCode`: The code of the brand for which to retrieve location details.
- `cityId`: The ID of the city for which to retrieve location details.
- `callback`: An instance of `ApiResponseCallback<BrandLocationCityResponse>` to handle the API response. It defines two methods:
  - `onSuccess`: Called when the API request is successful, receiving a `BrandLocationCityResponse` object.
  - `onError`: Called if there is an error during the API request, receiving an error message.

### Example Usage

```java
// Initialize the YouGotAGiftApiHandler
YouGotAGiftApiHandler youGotAGiftApiHandler = new YouGotAGiftApiHandler();

// Set parameters
String apiKey = "YOUR_API_KEY";
String brandCode = "BRAND_CODE"; // Replace with the desired brand code
String cityId = "CITY_ID"; // Replace with the desired city ID

// Make an API call to retrieve location details by city ID
youGotAGiftApiHandler.getLocationByCityId(apiKey, brandCode, cityId, new ApiResponseCallback<BrandLocationCityResponse>() {
    @Override
    public void onSuccess(BrandLocationCityResponse result) {
        // Handle successful response here
    }

    @Override
    public void onError(String errorMessage) {
        // Handle error response here
    }
});
```
## getCategories

This method retrieves categories from the YouGotAGift API.

### Parameters

- `apiKey`: The API key required to authenticate the request.
- `callback`: An instance of `ApiResponseCallback<CategoryResponse>` to handle the API response. It defines two methods:
  - `onSuccess`: Called when the API request is successful, receiving a `CategoryResponse` object.
  - `onError`: Called if there is an error during the API request, receiving an error message.

### Example Usage

```java
// Initialize the YouGotAGiftApiHandler
YouGotAGiftApiHandler youGotAGiftApiHandler = new YouGotAGiftApiHandler();

// Set parameters
String apiKey = "YOUR_API_KEY";

// Make an API call to retrieve categories
youGotAGiftApiHandler.getCategories(apiKey, new ApiResponseCallback<CategoryResponse>() {
    @Override
    public void onSuccess(CategoryResponse result) {
        // Handle successful response here
    }

    @Override
    public void onError(String errorMessage) {
        // Handle error response here
    }
});
```
## getCountries

This method retrieves countries from the YouGotAGift API.

### Parameters

- `apiKey`: The API key required to authenticate the request.
- `callback`: An instance of `ApiResponseCallback<CountryResponse>` to handle the API response. It defines two methods:
  - `onSuccess`: Called when the API request is successful, receiving a `CountryResponse` object.
  - `onError`: Called if there is an error during the API request, receiving an error message.

### Example Usage

```java
// Initialize the YouGotAGiftApiHandler
YouGotAGiftApiHandler youGotAGiftApiHandler = new YouGotAGiftApiHandler();

// Set parameters
String apiKey = "YOUR_API_KEY";

// Make an API call to retrieve countries
youGotAGiftApiHandler.getCountries(apiKey, new ApiResponseCallback<CountryResponse>() {
    @Override
    public void onSuccess(CountryResponse result) {
        // Handle successful response here
    }

    @Override
    public void onError(String errorMessage) {
        // Handle error response here
    }
});
```
## getCurrencyExchangeRates

This method retrieves currency exchange rates from the YouGotAGift API.

### Parameters

- `apiKey`: The API key required to authenticate the request.
- `callback`: An instance of `ApiResponseCallback<ExchangeRateResponse>` to handle the API response. It defines two methods:
  - `onSuccess`: Called when the API request is successful, receiving an `ExchangeRateResponse` object.
  - `onError`: Called if there is an error during the API request, receiving an error message.

### Example Usage

```java
// Initialize the YouGotAGiftApiHandler
YouGotAGiftApiHandler youGotAGiftApiHandler = new YouGotAGiftApiHandler();

// Set parameters
String apiKey = "YOUR_API_KEY";

// Make an API call to retrieve currency exchange rates
youGotAGiftApiHandler.getCurrencyExchangeRates(apiKey, new ApiResponseCallback<ExchangeRateResponse>() {
    @Override
    public void onSuccess(ExchangeRateResponse result) {
        // Handle successful response here
    }

    @Override
    public void onError(String errorMessage) {
        // Handle error response here
    }
});
```
## getCredentials

This method retrieves credentials from the YouGotAGift API.

### Parameters

- `apiKey`: The API key required to authenticate the request.
- `callback`: An instance of `ApiResponseCallback<CredentialsResponse>` to handle the API response. It defines two methods:
  - `onSuccess`: Called when the API request is successful, receiving a `CredentialsResponse` object.
  - `onError`: Called if there is an error during the API request, receiving an error message.

### Example Usage

```java
// Initialize the YouGotAGiftApiHandler
YouGotAGiftApiHandler youGotAGiftApiHandler = new YouGotAGiftApiHandler();

// Set parameters
String apiKey = "YOUR_API_KEY";

// Make an API call to retrieve credentials
youGotAGiftApiHandler.getCredentials(apiKey, new ApiResponseCallback<CredentialsResponse>() {
    @Override
    public void onSuccess(CredentialsResponse result) {
        // Handle successful response here
    }

    @Override
    public void onError(String errorMessage) {
        // Handle error response here
    }
});
```
## generateCredentials

This method generates credentials from the YouGotAGift API.

### Parameters

- `apiKey`: The API key required to authenticate the request.
- `callback`: An instance of `ApiResponseCallback<CredentialsGenerationResponse>` to handle the API response. It defines two methods:
  - `onSuccess`: Called when the API request is successful, receiving a `CredentialsGenerationResponse` object.
  - `onError`: Called if there is an error during the API request, receiving an error message.

### Example Usage

```java
// Initialize the YouGotAGiftApiHandler
YouGotAGiftApiHandler youGotAGiftApiHandler = new YouGotAGiftApiHandler();

// Set parameters
String apiKey = "YOUR_API_KEY";

// Make an API call to generate credentials
youGotAGiftApiHandler.generateCredentials(apiKey, new ApiResponseCallback<CredentialsGenerationResponse>() {
    @Override
    public void onSuccess(CredentialsGenerationResponse result) {
        // Handle successful response here
    }

    @Override
    public void onError(String errorMessage) {
        // Handle error response here
    }
});
```
## getBrandWebhooks

This method retrieves webhooks associated with a brand from the YouGotAGift API.

### Parameters

- `apiKey`: The API key required to authenticate the request.
- `callback`: An instance of `ApiResponseCallback<WebhooksResponse>` to handle the API response. It defines two methods:
  - `onSuccess`: Called when the API request is successful, receiving a `WebhooksResponse` object.
  - `onError`: Called if there is an error during the API request, receiving an error message.

### Example Usage

```java
// Initialize the YouGotAGiftApiHandler
YouGotAGiftApiHandler youGotAGiftApiHandler = new YouGotAGiftApiHandler();

// Set parameters
String apiKey = "YOUR_API_KEY";

// Make an API call to retrieve brand webhooks
youGotAGiftApiHandler.getBrandWebhooks(apiKey, new ApiResponseCallback<WebhooksResponse>() {
    @Override
    public void onSuccess(WebhooksResponse result) {
        // Handle successful response here
    }

    @Override
    public void onError(String errorMessage) {
        // Handle error response here
    }
});
```
## activateWebhook

This method activates a webhook with a specific ID in the YouGotAGift API.

### Parameters

- `apiKey`: The API key required to authenticate the request.
- `webhookId`: The ID of the webhook to be activated.
- `callback`: An instance of `ApiResponseCallback<WebhooksActivationResponse>` to handle the API response. It defines two methods:
  - `onSuccess`: Called when the API request is successful, receiving a `WebhooksActivationResponse` object.
  - `onError`: Called if there is an error during the API request, receiving an error message.

### Example Usage

```java
// Initialize the YouGotAGiftApiHandler
YouGotAGiftApiHandler youGotAGiftApiHandler = new YouGotAGiftApiHandler();

// Set parameters
String apiKey = "YOUR_API_KEY";
String webhookId = "WEBHOOK_ID";

// Make an API call to activate the webhook
youGotAGiftApiHandler.activateWebhook(apiKey, webhookId, new ApiResponseCallback<WebhooksActivationResponse>() {
    @Override
    public void onSuccess(WebhooksActivationResponse result) {
        // Handle successful response here
    }

    @Override
    public void onError(String errorMessage) {
        // Handle error response here
    }
});
```
## deactivateWebhook

This method deactivates a webhook with a specific ID in the YouGotAGift API.

### Parameters

- `apiKey`: The API key required to authenticate the request.
- `webhookId`: The ID of the webhook to be deactivated.
- `callback`: An instance of `ApiResponseCallback<WebhooksDeactivationResponse>` to handle the API response. It defines two methods:
  - `onSuccess`: Called when the API request is successful, receiving a `WebhooksDeactivationResponse` object.
  - `onError`: Called if there is an error during the API request, receiving an error message.

### Example Usage

```java
// Initialize the YouGotAGiftApiHandler
YouGotAGiftApiHandler youGotAGiftApiHandler = new YouGotAGiftApiHandler();

// Set parameters
String apiKey = "YOUR_API_KEY";
String webhookId = "WEBHOOK_ID";

// Make an API call to deactivate the webhook
youGotAGiftApiHandler.deactivateWebhook(apiKey, webhookId, new ApiResponseCallback<WebhooksDeactivationResponse>() {
    @Override
    public void onSuccess(WebhooksDeactivationResponse result) {
        // Handle successful response here
    }

    @Override
    public void onError(String errorMessage) {
        // Handle error response here
    }
});
```
## createOrder

This method creates a new order in the YouGotAGift API.

### Parameters

- `apiKey`: The API key required to authenticate the request.
- `request`: An instance of `OrderCreateRequest` containing the details of the order to be created.
- `callback`: An instance of `ApiResponseCallback<OrderCreateResponse>` to handle the API response. It defines two methods:
  - `onSuccess`: Called when the API request is successful, receiving an `OrderCreateResponse` object containing information about the created order.
  - `onError`: Called if there is an error during the API request, receiving an error message.

```java
// Create an instance of OrderCreateRequest and set its properties
OrderCreateRequest orderRequest = new OrderCreateRequest();
orderRequest.setReferenceId("124DSF");
orderRequest.setNotify(1);
orderRequest.setBrandCode("184726");
orderRequest.setCurrency("AED");
orderRequest.setAmount(200);
orderRequest.setCountry("AE");
orderRequest.setReceiverName("Jhon");
orderRequest.setReceiverEmail("jhon@example.com");
orderRequest.setReceiverPhone("0551111111");
orderRequest.setMessage("Well Done!,\nI thought you would like this gift!");
Map<String, String> extraFields = new HashMap<>();
extraFields.put("department", "Information Technology");
extraFields.put("custuomer_id", "A1232");
extraFields.put("pi_12", "12Ag");
orderRequest.setExtraFields(extraFields);
orderRequest.setDeliveryLanguage("en");

// Make API call to create the order
youGotAGiftApiHandler.createOrder(API_KEY, orderRequest, new ApiResponseCallback<OrderCreateResponse>() {
    @Override
    public void onSuccess(OrderCreateResponse result) {
        // Handle successful response here
    }

    @Override
    public void onError(String errorMessage) {
        // Handle error response here
    }
});
```
## topupAccount

This method initiates a top-up request to add funds to a user's account in the YouGotAGift API.

### Parameters

- `apiKey`: The API key required to authenticate the request.
- `request`: An instance of `TopupRequest` containing the details of the top-up request, including the currency, amount, and reference ID.
- `callback`: An instance of `ApiResponseCallback<TopupResponse>` to handle the API response. It defines two methods:
  - `onSuccess`: Called when the API request is successful, receiving a `TopupResponse` object containing information about the top-up transaction.
  - `onError`: Called if there is an error during the API request, receiving an error message.
```java
// Create an instance of TopupRequest and set its properties
TopupRequest topupRequest = new TopupRequest();
topupRequest.setCurrency("AED");
topupRequest.setAmount(1000);
topupRequest.setReferenceId("12335");

// Make API call to initiate the top-up request
youGotAGiftApiHandler.topupAccount(API_KEY, topupRequest, new ApiResponseCallback<TopupResponse>() {
    @Override
    public void onSuccess(TopupResponse result) {
        // Handle successful response here
    }

    @Override
    public void onError(String errorMessage) {
        // Handle error response here
    }
});
```
## activateCredentials

This method activates the credentials associated with a given API key in the YouGotAGift API.

### Parameters

- `apiKey`: The API key required to authenticate the request.
- `request`: An instance of `CredentialActivationRequest` containing the API key to be activated.
- `callback`: An instance of `ApiResponseCallback<CredentialActivationResponse>` to handle the API response. It defines two methods:
  - `onSuccess`: Called when the API request is successful, receiving a `CredentialActivationResponse` object containing information about the activation status.
  - `onError`: Called if there is an error during the API request, receiving an error message.
```java
// Create an instance of CredentialActivationRequest and set its apiKey property
CredentialActivationRequest activationRequest = new CredentialActivationRequest();
activationRequest.setApiKey("JMWIB0YUDTJSDJAPRW9D");

// Make API call to activate the credentials
youGotAGiftApiHandler.activateCredentials(API_KEY, activationRequest, new ApiResponseCallback<CredentialActivationResponse>() {
    @Override
    public void onSuccess(CredentialActivationResponse result) {
        // Handle successful response here
    }

    @Override
    public void onError(String errorMessage) {
        // Handle error response here
    }
});
```
## createWebhook

This method creates a new webhook in the YouGotAGift API.

### Parameters

- `apiKey`: The API key required to authenticate the request.
- `request`: An instance of `WebhookCreateRequest` containing the details of the webhook to be created, including the URL where notifications will be sent.
- `callback`: An instance of `ApiResponseCallback<WebhookCreateResponse>` to handle the API response. It defines two methods:
  - `onSuccess`: Called when the API request is successful, receiving a `WebhookCreateResponse` object containing information about the created webhook, including its URL.
  - `onError`: Called if there is an error during the API request, receiving an error message.
```java
// Create an instance of WebhookCreateRequest and set its url property
WebhookCreateRequest webhookRequest = new WebhookCreateRequest();
webhookRequest.setUrl("https://yourapp.com/webhooks/brands/<notification_url_1>");

// Make API call to create the webhook
youGotAGiftApiHandler.createWebhook(API_KEY, webhookRequest, new ApiResponseCallback<WebhookCreateResponse>() {
    @Override
    public void onSuccess(WebhookCreateResponse result) {
        // Handle successful response here
    }

    @Override
    public void onError(String errorMessage) {
        // Handle error response here
    }
});
```
## simulateWebhook

This method simulates a webhook trigger in the YouGotAGift API.

### Parameters

- `apiKey`: The API key required to authenticate the request.
- `webhookId`: The ID of the webhook to be simulated.
- `callback`: An instance of `ApiResponseCallback<SimulateWebhookResponse>` to handle the API response. It defines two methods:
  - `onSuccess`: Called when the API request is successful, receiving a `SimulateWebhookResponse` object containing information about the simulated webhook.
  - `onError`: Called if there is an error during the API request, receiving an error message.

### Example Usage

```java
// Make API call to simulate the webhook
youGotAGiftApiHandler.simulateWebhook(API_KEY, "webhookId", new ApiResponseCallback<SimulateWebhookResponse>() {
    @Override
    public void onSuccess(SimulateWebhookResponse result) {
        // Handle successful response here
    }

    @Override
    public void onError(String errorMessage) {
        // Handle error response here
    }
});
```

