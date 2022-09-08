Feature: Search for a PO with like (~) symbol

  Background:
    Given Purchase Orders in the system are as follows:
      | Code       | Type                   | Vendor            | Reference Document                 | Business Unit | State     |
      | 2020000048 | Local Purchase Order   | 000002 - Zhejiang | --                                 | Signmedia     | Shipped   |
      | 2020000047 | Service Purchase Order | 000002 - Zhejiang | Local Purchase Order - 2018000017  | Signmedia     | Confirmed |
      | 2020000046 | Service Purchase Order | 000002 - Zhejiang | Import Purchase Order - 2018000023 | Offset        | Confirmed |
      | 2020000045 | Service Purchase Order | 000001 - Zhejiang | Import Purchase Order - 2018000001 | Signmedia     | Confirmed |
      | 2020000004 | Service Purchase Order | 000001 - Zhejiang | Import Purchase Order - 2018000055 | Flexo         | Draft     |
      | 2020000002 | Local Purchase Order   | 000001 - Sigewerk | --                                 | Flexo         | Shipped   |
      | 2020000003 | Local Purchase Order   | 000002 - Sigewerk | --                                 | Flexo         | Shipped   |
      | 2018000001 | Import Purchase Order  | 000003 - Zhejiang | --                                 | Signmedia     | Cleared   |
      | 2018100006 | Local Purchase Order   | 000002 - Zhejiang | --                                 | Signmedia     | Draft     |
      | 2020000040 | Local Purchase Order   | 000002 - Sigewerk | --                                 | Signmedia     | Draft     |
      | 2021000001 | Service Purchase Order | 000001 - Zhejiang | Local Purchase Order - 2018000017  | Signmedia     | Draft     |

  Scenario:Search for a PO with Code
    When Operator requests for purchase orders with "Code" with query "PO with Code ~ 2018"
    Then the System Results Will Show as follows:
      | Code       | Type                  | Vendor            | Reference Document | Business Unit | State   |
      | 2018000001 | Import Purchase Order | 000003 - Zhejiang | --                 | Signmedia     | Cleared |
      | 2018100006 | Local Purchase Order  | 000002 - Zhejiang | --                 | Signmedia     | Draft   |

  Scenario:Search for a PO with Type
    When Operator requests for purchase orders with "Type" with query "PO with type ~ Service"
    Then the System Results Will Show as follows:
      | Code       | Type                   | Vendor            | Reference Document                 | Business Unit | State     |
      | 2020000047 | Service Purchase Order | 000002 - Zhejiang | Local Purchase Order - 2018000017  | Signmedia     | Confirmed |
      | 2020000046 | Service Purchase Order | 000002 - Zhejiang | Import Purchase Order - 2018000023 | Offset        | Confirmed |
      | 2020000045 | Service Purchase Order | 000001 - Zhejiang | Import Purchase Order - 2018000001 | Signmedia     | Confirmed |
      | 2020000004 | Service Purchase Order | 000001 - Zhejiang | Import Purchase Order - 2018000055 | Flexo         | Draft     |
      | 2021000001 | Service Purchase Order | 000001 - Zhejiang | Local Purchase Order - 2018000017  | Signmedia     | Draft     |

  Scenario:Search for a PO with Vendor
    When Operator requests for purchase orders with "Vendor" with query "PO with vendor ~ Sigewerk"
    Then the System Results Will Show as follows:
      | Code       | Type                 | Vendor            | Reference Document | Business Unit | State   |
      | 2020000002 | Local Purchase Order | 000001 - Sigewerk | --                 | Flexo         | Shipped |
      | 2020000003 | Local Purchase Order | 000002 - Sigewerk | --                 | Flexo         | Shipped |
      | 2020000040 | Local Purchase Order | 000002 - Sigewerk | --                 | Signmedia     | Draft   |

  Scenario:Search for a PO with Reference Document
    When Operator requests for purchase orders with "Reference Document" with query "PO with Reference Document ~ Import P"
    Then the System Results Will Show as follows:
      | Code       | Type                   | Vendor            | Reference Document                 | Business Unit | State     |
      | 2020000046 | Service Purchase Order | 000002 - Zhejiang | Import Purchase Order - 2018000023 | Offset        | Confirmed |
      | 2020000045 | Service Purchase Order | 000001 - Zhejiang | Import Purchase Order - 2018000001 | Signmedia     | Confirmed |
      | 2020000004 | Service Purchase Order | 000001 - Zhejiang | Import Purchase Order - 2018000055 | Flexo         | Draft     |

  Scenario:Search for a PO with Business Unit
    When Operator requests for purchase orders with "Business Unit" with query "PO with Business Unit ~ media"
    Then the System Results Will Show as follows:
      | Code       | Type                   | Vendor            | Reference Document                 | Business Unit | State     |
      | 2018000001 | Import Purchase Order  | 000003 - Zhejiang | --                                 | Signmedia     | Cleared   |
      | 2018100006 | Local Purchase Order   | 000002 - Zhejiang | --                                 | Signmedia     | Draft     |
      | 2020000045 | Service Purchase Order | 000001 - Zhejiang | Import Purchase Order - 2018000001 | Signmedia     | Confirmed |
      | 2020000048 | Local Purchase Order   | 000002 - Zhejiang | --                                 | Signmedia     | Shipped   |
      | 2020000047 | Service Purchase Order | 000002 - Zhejiang | Local Purchase Order - 2018000017  | Signmedia     | Confirmed |

  Scenario:Search for a PO with State
    When Operator requests for purchase orders with "State" with query "PO with State ~ Ship"
    Then the System Results Will Show as follows:
      | Code       | Type                 | Vendor            | Reference Document | Business Unit | State   |
      | 2020000048 | Local Purchase Order | 000002 - Zhejiang | --                 | Signmedia     | Shipped |
      | 2020000002 | Local Purchase Order | 000001 - Sigewerk | --                 | Flexo         | Shipped |
      | 2020000003 | Local Purchase Order | 000002 - Sigewerk | --                 | Flexo         | Shipped |

  Scenario Outline: Search with wrong Attribute
    When Operator searches for query "<query>"
    Then Error message "<message>" returned
    Examples:
      | query                 | message                                       |
      | PO with Statte ~ ship | mismatched input 'Statte' expecting SEARCH_BY |
      | po wit table = ship   | mismatched input 'wit' expecting WITH         |
      | no with state ~ ship  | mismatched input 'no' expecting TYPE          |
      |                       | mismatched input '<EOF>' expecting TYPE       |
      | po state ~ ship       | missing WITH at 'state'                       |
      | po with code ship     | missing SEARCH_OPERATOR at 'ship'             |
      | po with code ! ship   | missing SEARCH_OPERATOR at 'ship'             |

#
#  Scenario:Search for a PO and only one record matches
#    When Operator requests for purchase orders with State with query "PO with State ~  Cleared"
#    Then the System will return "https://localhost:8080/#/orders/purchase-order/2018000001"
