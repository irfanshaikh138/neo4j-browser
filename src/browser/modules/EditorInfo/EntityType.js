import React from 'react'
import {
  DrawerSubHeader,
  DrawerSection,
  DrawerSectionBody
} from 'browser-components/drawer'

export const EntityType = ({ itemType = '' }) => {
  return (
    <DrawerSection>
      <DrawerSubHeader>Entity Type</DrawerSubHeader>
      <DrawerSectionBody>{itemType}</DrawerSectionBody>
    </DrawerSection>
  )
}
