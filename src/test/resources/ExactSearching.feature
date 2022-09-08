Feature: Search for a PO with exact value using (=) symbol

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

  Scenario:Search for a PO with exact Code
    When Operator requests for purchase orders with "Code" with query "PO with code = 2020000048"
    Then the System Results Will Show as follows:
      | Code       | Type                 | Vendor            | Reference Document | Business Unit | State   |
      | 2020000048 | Local Purchase Order | 000002 - Zhejiang | --                 | Signmedia     | Shipped |

#  Scenario: Scenario:Search for a PO with exact Code
#    When Operator requests for purchase orders with "Code" with query "PO with Code = 2019001100"
#    Then the System will show no results

  Scenario:Search for a PO with exact Type
    When Operator requests for purchase orders with "Type" with query "PO with type = Local Purchase Order"
    Then the System Results Will Show as follows:
      | Code       | Type                 | Vendor            | Reference Document | Business Unit | State   |
      | 2020000048 | Local Purchase Order | 000002 - Zhejiang | --                 | Signmedia     | Shipped |
      | 2020000002 | Local Purchase Order | 000001 - Sigewerk | --                 | Flexo         | Shipped |
      | 2020000003 | Local Purchase Order | 000002 - Sigewerk | --                 | Flexo         | Shipped |
      | 2018100006 | Local Purchase Order | 000002 - Zhejiang | --                 | Signmedia     | Draft   |
      | 2020000040 | Local Purchase Order | 000002 - Sigewerk | --                 | Signmedia     | Draft   |

  Scenario:Search for a PO with exact Vendor
    When Operator requests for purchase orders with "Vendor" with query "PO with vendor = 000002 - Sigewerk"
    Then the System Results Will Show as follows:
      | Code       | Type                 | Vendor            | Reference Document | Business Unit | State   |
      | 2020000003 | Local Purchase Order | 000002 - Sigewerk | --                 | Flexo         | Shipped |
      | 2020000040 | Local Purchase Order | 000002 - Sigewerk | --                 | Signmedia     | Draft   |

  Scenario:Search for a PO with exact Reference Document
    When Operator requests for purchase orders with "Reference Document" with query "PO with Reference Document = Import Purchase Order - 2018000023"
    Then the System Results Will Show as follows:
      | Code       | Type                   | Vendor            | Reference Document                 | Business Unit | State     |
      | 2020000046 | Service Purchase Order | 000002 - Zhejiang | Import Purchase Order - 2018000023 | Offset        | Confirmed |

  Scenario:Search for a PO with exact Business Unit
    When Operator requests for purchase orders with "Business Unit" with query "PO with Business Unit = Flexo"
    Then the System Results Will Show as follows:
      | Code       | Type                   | Vendor            | Reference Document                 | Business Unit | State   |
      | 2020000004 | Service Purchase Order | 000001 - Zhejiang | Import Purchase Order - 2018000055 | Flexo         | Draft   |
      | 2020000002 | Local Purchase Order   | 000001 - Sigewerk | --                                 | Flexo         | Shipped |
      | 2020000003 | Local Purchase Order   | 000002 - Sigewerk | --                                 | Flexo         | Shipped |

  Scenario:Search for a PO with exact State
    When Operator requests for purchase orders with "State" with query "PO with State = Draft"
    Then the System Results Will Show as follows:
      | Code       | Type                   | Vendor            | Reference Document                 | Business Unit | State |
      | 2020000004 | Service Purchase Order | 000001 - Zhejiang | Import Purchase Order - 2018000055 | Flexo         | Draft |
      | 2018100006 | Local Purchase Order   | 000002 - Zhejiang | --                                 | Signmedia     | Draft |
      | 2020000040 | Local Purchase Order   | 000002 - Sigewerk | --                                 | Signmedia     | Draft |
      | 2021000001 | Service Purchase Order | 000001 - Zhejiang | Local Purchase Order - 2018000017  | Signmedia     | Draft     |

